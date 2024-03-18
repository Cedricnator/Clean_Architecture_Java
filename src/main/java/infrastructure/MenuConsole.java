package infrastructure;

import domain.entities.Concesionary;
import domain.ports.input.ICreateConsesonaryUseCase;
import domain.ports.input.ISearchConcesonaryUseCase;

import java.util.List;

public class MenuConsole {
    private final Console _console;
    private final ISearchConcesonaryUseCase _searchConcesonaryUseCase;
    private final ICreateConsesonaryUseCase _createConsesonaryUseCase;

    public MenuConsole(
            Console console,
            ISearchConcesonaryUseCase searchConcesonaryUseCase,
            ICreateConsesonaryUseCase createConsesonaryUseCase
    ){
        this._console = console;
        this._searchConcesonaryUseCase = searchConcesonaryUseCase;
        this._createConsesonaryUseCase = createConsesonaryUseCase;
    }

    public void start(){
        int option;
        do {
            _console.showMenu();
            option = _console.readOption();
            switch (option){
                case 1:
                    createConcesonary();
                    break;
                case 2:
                    searchConcesonary();
                    break;
                case 3:
                    seeConcesonary();
                    break;
                case 4:
                    _console.showMessage("Closing the application....");
                    break;
                default:
                    _console.showMessage("Option not valid, try again");
            }

        }while ( option!= 4);
    }

    private void seeConcesonary(){
        List<Concesionary> concesionaries = _searchConcesonaryUseCase.searchAll();
        for (Concesionary concesionary : concesionaries){
            _console.showMessage("[ ID: " + concesionary.get_id() + ", Name: " +concesionary.get_name() + " ]");
        }
    }

    private void searchConcesonary(){
        int id = _console.readInt("[2] Introduce the ID of the concesonary");
        Concesionary concesionary = _searchConcesonaryUseCase.searchById(id);
        if ( concesionary == null){
            _console.showMessage("The concesonary with ID: " + id + "don't exist");
        } else {
            _console.showMessage("Concesonary founded with [ID: " + concesionary.get_id() + ", Name: " + concesionary.get_name()+ "]");
        }
    }

    private void createConcesonary(){
        String name = _console.readText("[1] Please provide the \u001B[31mname\u001B[0m of the concesonary");
        Concesionary concesionary = _createConsesonaryUseCase.createConcesionary(name);
        _console.showMessage("Concesonary created with [ID: " + concesionary.get_id() + ", Name: " + concesionary.get_name()+ "]") ;
    }

}
