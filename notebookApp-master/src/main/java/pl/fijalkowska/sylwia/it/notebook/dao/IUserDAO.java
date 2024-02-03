package pl.fijalkowska.sylwia.it.notebook.dao;

import pl.fijalkowska.sylwia.it.notebook.dao.memory.NoteRepository;
import pl.fijalkowska.sylwia.it.notebook.model.User;

import java.util.List;

public interface IUserDAO {

    User getById(int id);

    User getByLogin(String login);

    List<User> getAll();

    void save(User user);

    void delete(int id);

    void update(User user);

    NoteRepository getUserNotes(User user);
}
