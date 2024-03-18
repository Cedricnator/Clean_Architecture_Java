package domain.ports.output;

import domain.entities.Concesionary;

import java.util.List;

public interface IConcesonaryRepository {
    Concesionary searchById(int id);
    List<Concesionary> searchAll();
    void save(Concesionary concesionary);
}
