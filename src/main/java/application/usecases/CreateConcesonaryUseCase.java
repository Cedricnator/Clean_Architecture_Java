package application.usecases;

import domain.entities.Concesionary;
import domain.ports.input.ICreateConsesonaryUseCase;
import domain.ports.output.IConcesonaryRepository;

public class CreateConcesonaryUseCase implements ICreateConsesonaryUseCase {
    private final IConcesonaryRepository _concesonaryRepository;

    public CreateConcesonaryUseCase(IConcesonaryRepository _concesonaryRepository) {
        this._concesonaryRepository = _concesonaryRepository;
    }

    @Override
    public Concesionary createConcesionary(String name) {
        int id = (int) Math.floor(Math.random() * 1000);
        Concesionary concesionary = new Concesionary(id, name);
        _concesonaryRepository.save(concesionary);
        return concesionary;
    }
}
