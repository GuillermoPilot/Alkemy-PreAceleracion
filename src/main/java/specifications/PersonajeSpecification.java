package specifications;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Expression;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.peliculas.Alkemy.DTO.PersonajeFiltersDTO;
import com.peliculas.Alkemy.Entities.Pelicula;
import com.peliculas.Alkemy.Entities.Personaje;

@Component
public class PersonajeSpecification {

	public Specification<Personaje> getByFilters(PersonajeFiltersDTO filtersDTO) {
		return (root, query, criteriaBuilder) -> {

			List<Predicate> predicates = new ArrayList<>();

			if (StringUtils.hasLength(filtersDTO.getNombre())) {
				predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("nombre")),
						"%" + filtersDTO.getNombre().toLowerCase() + "%")

				);
			}

			if (StringUtils.hasLength(filtersDTO.getEdad().toString())) {
				predicates.add(
						criteriaBuilder.like(criteriaBuilder.lower(root.get("edad")), "%" + filtersDTO.getEdad() + "%")

				);
			}

			if (!CollectionUtils.isEmpty(filtersDTO.getMovies())) {
				Join<Pelicula, Personaje> join = root.join("pelicula", JoinType.INNER);
				Expression<String> idMovies = join.get("id");
				predicates.add(idMovies.in(filtersDTO.getMovies()));

			}

			query.distinct(true);

			return criteriaBuilder.and(predicates.toArray(new Predicate[0]));

		};
	}

}
