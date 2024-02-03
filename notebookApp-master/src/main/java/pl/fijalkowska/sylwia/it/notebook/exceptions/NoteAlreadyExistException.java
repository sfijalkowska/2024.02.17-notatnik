package pl.fijalkowska.sylwia.it.notebook.exceptions;

public class NoteAlreadyExistException extends RuntimeException{
    public NoteAlreadyExistException(String message){
        super(message);
    }
}
