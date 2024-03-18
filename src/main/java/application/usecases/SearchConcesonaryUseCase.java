package application.usecases;

import domain.entities.Concesionary;
import domain.ports.input.ISearchConcesonaryUseCase;
import domain.ports.output.IConcesonaryRepository;

import java.util.List;

public class SearchConcesonaryUseCase implements ISearchConcesonaryUseCase {
    private final IConcesonaryRepository _concesonaryRepository;

    public SearchConcesonaryUseCase(IConcesonaryRepository _concesonaryRepository) {
        this._concesonaryRepository = _concesonaryRepository;
    }

    @Override
    public Concesionary searchById(int id) {
        return _concesonaryRepository.searchById(id);
    }

    @Override
    public List<Concesionary> searchAll() {
        return _concesonaryRepository.searchAll();
    }
}
