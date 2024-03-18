package infrastructure;

import domain.entities.Concesionary;
import domain.ports.output.IConcesonaryRepository;

import java.util.ArrayList;
import java.util.List;

public class ConcesonaryRepositoryInMemory implements IConcesonaryRepository {
    private final List<Concesionary> _concesionary;

    public ConcesonaryRepositoryInMemory() {
        this._concesionary = new ArrayList<>();
    }

    @Override
    public Concesionary searchById(int id) {
        for ( Concesionary concesionary : _concesionary ){
            if (concesionary.get_id() == id){
                return concesionary;
            }
        }
        return null;
    }

    @Override
    public List<Concesionary> searchAll() {
        return new ArrayList<>(_concesionary);
    }

    @Override
    public void save(Concesionary concesionary) {
        _concesionary.add(concesionary);
    }
}
