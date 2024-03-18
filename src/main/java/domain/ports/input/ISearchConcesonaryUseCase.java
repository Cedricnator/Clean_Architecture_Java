package domain.ports.input;

import domain.entities.Concesionary;

import java.util.List;

public interface ISearchConcesonaryUseCase {
    Concesionary searchById( int id);
    List<Concesionary> searchAll();
}
