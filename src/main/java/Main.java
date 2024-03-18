import infrastructure.ConcesonaryRepositoryInMemory;
import infrastructure.Console;
import domain.ports.input.ICreateConsesonaryUseCase;
import domain.ports.input.ISearchConcesonaryUseCase;
import domain.ports.output.IConcesonaryRepository;
import application.usecases.CreateConcesonaryUseCase;
import application.usecases.SearchConcesonaryUseCase;
import infrastructure.MenuConsole;

public class Main {
    public static void main(String[] args) {
        // Repositorios
        IConcesonaryRepository concesonaryRepository = new ConcesonaryRepositoryInMemory();

        // Casos de uso
        ICreateConsesonaryUseCase createConsesonaryUseCase = new CreateConcesonaryUseCase(concesonaryRepository);
        ISearchConcesonaryUseCase searchConcesonaryUseCase = new SearchConcesonaryUseCase(concesonaryRepository);

        // Controladores
        Console console = new Console();
        MenuConsole menuConsole = new MenuConsole(console, searchConcesonaryUseCase, createConsesonaryUseCase);
        menuConsole.start();
        console.close();
    }
}