package pl.fijalkowska.sylwia.it.notebook.dao;

import pl.fijalkowska.sylwia.it.notebook.model.Note;

import java.util.List;

public interface INoteDAO {
    Note getById(int id);
    List<Note> getAll();
    List<Note> getByPattern(String pattern);
    void save(Note note);
    void update(Note note);
    void delete(int id);

}
