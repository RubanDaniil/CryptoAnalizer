import com.javarush.cryptoanalyzer.ruban.app.Application;
import com.javarush.cryptoanalyzer.ruban.controller.MainController;
import com.javarush.cryptoanalyzer.ruban.entity.Result;
import com.javarush.cryptoanalyzer.ruban.view.ConsoleView;
import com.javarush.cryptoanalyzer.ruban.view.View;

public static void main(String[] args) {
    View view = new ConsoleView();
    MainController mainController = new MainController(view);
    Application application = new Application(mainController);

    Result result = application.run();
    application.printResult(result);
}