package domain.ports.input;

import domain.entities.Concesionary;

public interface ICreateConsesonaryUseCase {
    Concesionary createConcesionary(String name);
}
