package hu.elte.projekteszkozok.repository;

import hu.elte.projekteszkozok.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note,Integer> {
}
