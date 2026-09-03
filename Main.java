import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Case detectiveCase;

    @Override
    public void start(Stage stage) {

        createCaseData();
        showWelcomeScreen(stage);
    }

    // Create the case data
    private void createCaseData() {

        detectiveCase = new Case("The Missing Diamond");

        // SUSPECTS

        detectiveCase.addSuspect(
                new Suspect(
                        "Alex",
                        "Security Guard",
                        "I was monitoring the lobby."
                )
        );

        detectiveCase.addSuspect(
                new Suspect(
                        "Brian",
                        "Hotel Employee",
                        "I was working at the reception."
                )
        );

        detectiveCase.addSuspect(
                new Suspect(
                        "Clara",
                        "Hotel Manager",
                        "I was in my office."
                )
        );

        detectiveCase.addSuspect(
                new Suspect(
                        "David",
                        "Guest",
                        "I was in the restaurant."
                )
        );

        detectiveCase.addSuspect(
                new Suspect(
                        "Emma",
                        "Photographer",
                        "I was taking photographs."
                )
        );


        // EVIDENCE

        detectiveCase.addEvidence(
                new Evidence(
                        1,
                        "Broken Access Card",
                        "A damaged access card was found near Room 204.",
                        "Room 204"
                )
        );

        detectiveCase.addEvidence(
                new Evidence(
                        2,
                        "Fingerprint",
                        "A partial fingerprint was found on the diamond box.",
                        "Room 204"
                )
        );

        detectiveCase.addEvidence(
                new Evidence(
                        3,
                        "CCTV Footage",
                        "Someone entered Room 204 at 8:27 PM.",
                        "Second Floor"
                )
        );

        detectiveCase.addEvidence(
                new Evidence(
                        4,
                        "Hotel Exit Record",
                        "David's official exit time was recorded as 8:37 PM.",
                        "Hotel Entrance"
                )
        );

        detectiveCase.addEvidence(
                new Evidence(
                        5,
                        "Reception Log",
                        "Brian left the reception desk from 8:10 PM to 8:23 PM.",
                        "Reception"
                )
        );

        detectiveCase.addEvidence(
                new Evidence(
                        6,
                        "Security Log",
                        "The security terminal was accessed at 8:24 PM by user ALEX-SECURITY.",
                        "Security Room"
                )
        );


        // STATEMENTS

        detectiveCase.addStatement(
                new Statement(
                        "Alex",
                        "I was monitoring the lobby from 8:00 PM to 9:00 PM."
                )
        );

        detectiveCase.addStatement(
                new Statement(
                        "Brian",
                        "I was working at the reception desk."
                )
        );

        detectiveCase.addStatement(
                new Statement(
                        "Clara",
                        "I was in my office checking hotel records."
                )
        );

        detectiveCase.addStatement(
                new Statement(
                        "David",
                        "I left the hotel at 8:20 PM."
                )
        );

        detectiveCase.addStatement(
                new Statement(
                        "Emma",
                        "I was taking photographs on the second floor."
                )
        );
    }


    // WELCOME SCREEN

    private void showWelcomeScreen(Stage stage) {

        Label title = new Label("DIGITAL DETECTIVE");
        title.setStyle("-fx-font-size: 28px; -fx-font-weight: bold;");

        Label caseName = new Label(
                "CASE: " + detectiveCase.getCaseName().toUpperCase()
        );

        caseName.setStyle("-fx-font-size: 18px;");

        Label description = new Label(
                "A valuable diamond has disappeared.\n" +
                "Investigate the suspects, evidence and statements!"
        );

        Button startButton = new Button("START CASE");

        startButton.setOnAction(e ->
                showInvestigation(stage)
        );

        VBox layout = new VBox(20);

        layout.setStyle(
                "-fx-padding: 40;" +
                "-fx-alignment: center;"
        );

        layout.getChildren().addAll(
                title,
                caseName,
                description,
                startButton
        );

        Scene scene = new Scene(layout, 700, 500);

        stage.setTitle("Digital Detective");
        stage.setScene(scene);
        stage.show();
    }


    // INVESTIGATION MENU

    private void showInvestigation(Stage stage) {

        Label title = new Label("INVESTIGATION");

        title.setStyle(
                "-fx-font-size: 25px;" +
                "-fx-font-weight: bold;"
        );

        Label message = new Label(
                "Choose an option to investigate the case."
        );

        Button suspectsButton = new Button("VIEW SUSPECTS");

        Button evidenceButton = new Button("VIEW EVIDENCE");

        Button statementsButton = new Button("VIEW STATEMENTS");

        Button solveButton = new Button("SOLVE THE CASE");

        suspectsButton.setOnAction(e ->
                showSuspects(stage)
        );

        evidenceButton.setOnAction(e ->
                showEvidence(stage)
        );

        statementsButton.setOnAction(e ->
                showStatements(stage)
        );

        solveButton.setOnAction(e ->
                showSolveCase(stage)
        );

        VBox layout = new VBox(15);

        layout.setStyle(
                "-fx-padding: 40;" +
                "-fx-alignment: center;"
        );

        layout.getChildren().addAll(
                title,
                message,
                suspectsButton,
                evidenceButton,
                statementsButton,
                solveButton
        );

        stage.setScene(
                new Scene(layout, 700, 500)
        );
    }


    // SUSPECTS SCREEN

    private void showSuspects(Stage stage) {

        Label title = new Label("SUSPECTS");

        title.setStyle(
                "-fx-font-size: 24px;" +
                "-fx-font-weight: bold;"
        );

        VBox layout = new VBox(12);

        layout.setStyle(
                "-fx-padding: 30;" +
                "-fx-alignment: center;"
        );

        layout.getChildren().add(title);

        for (Suspect suspect : detectiveCase.getSuspects()) {

            Label suspectInfo = new Label(
                    "Name: " + suspect.getName() +
                    "\nOccupation: " + suspect.getOccupation() +
                    "\nAlibi: " + suspect.getAlibi()
            );

            suspectInfo.setStyle(
                    "-fx-border-color: black;" +
                    "-fx-padding: 10;"
            );

            layout.getChildren().add(suspectInfo);
        }

        Button backButton = new Button("BACK");

        backButton.setOnAction(e ->
                showInvestigation(stage)
        );

        layout.getChildren().add(backButton);

        stage.setScene(
                new Scene(layout, 700, 650)
        );
    }


    // EVIDENCE SCREEN

    private void showEvidence(Stage stage) {

        Label title = new Label("EVIDENCE");

        title.setStyle(
                "-fx-font-size: 24px;" +
                "-fx-font-weight: bold;"
        );

        VBox layout = new VBox(10);

        layout.setStyle(
                "-fx-padding: 30;" +
                "-fx-alignment: center;"
        );

        layout.getChildren().add(title);

        for (Evidence evidence : detectiveCase.getEvidence()) {

            Label evidenceInfo = new Label(
                    "Evidence #" + evidence.getId() +
                    "\nTitle: " + evidence.getTitle() +
                    "\nDescription: " + evidence.getDescription() +
                    "\nLocation: " + evidence.getLocation()
            );

            evidenceInfo.setStyle(
                    "-fx-border-color: black;" +
                    "-fx-padding: 10;"
            );

            layout.getChildren().add(evidenceInfo);
        }

        Button backButton = new Button("BACK");

        backButton.setOnAction(e ->
                showInvestigation(stage)
        );

        layout.getChildren().add(backButton);

        stage.setScene(
                new Scene(layout, 750, 700)
        );
    }


    // STATEMENTS SCREEN

    private void showStatements(Stage stage) {

        Label title = new Label("SUSPECT STATEMENTS");

        title.setStyle(
                "-fx-font-size: 24px;" +
                "-fx-font-weight: bold;"
        );

        VBox layout = new VBox(15);

        layout.setStyle(
                "-fx-padding: 30;" +
                "-fx-alignment: center;"
        );

        layout.getChildren().add(title);

        for (Statement statement : detectiveCase.getStatements()) {

            Label statementInfo = new Label(
                    statement.getSuspectName() +
                    ":\n\"" +
                    statement.getStatement() +
                    "\""
            );

            statementInfo.setStyle(
                    "-fx-border-color: black;" +
                    "-fx-padding: 10;"
            );

            layout.getChildren().add(statementInfo);
        }

        Button backButton = new Button("BACK");

        backButton.setOnAction(e ->
                showInvestigation(stage)
        );

        layout.getChildren().add(backButton);

        stage.setScene(
                new Scene(layout, 700, 650)
        );
    }


    // SOLVE THE CASE SCREEN

    private void showSolveCase(Stage stage) {

        Label title = new Label("SOLVE THE CASE");

        title.setStyle(
                "-fx-font-size: 25px;" +
                "-fx-font-weight: bold;"
        );

        Label question = new Label(
                "Who do you think is responsible for the crime?"
        );

        ComboBox<String> suspectBox = new ComboBox<>();

        suspectBox.getItems().addAll(
                "Alex",
                "Brian",
                "Clara",
                "David",
                "Emma"
        );

        Button submitButton = new Button("SUBMIT ANSWER");

        Label result = new Label();

        submitButton.setOnAction(e -> {

            String selectedSuspect = suspectBox.getValue();

            if (selectedSuspect == null) {

                result.setText(
                        "Please select a suspect first!"
                );

            } else if (selectedSuspect.equals("David")) {

                result.setText(
                        "CASE SOLVED!\n\n" +
                        "David was lying about leaving at 8:20 PM.\n" +
                        "The hotel exit record shows he left at 8:37 PM.\n" +
                        "The CCTV footage also places someone near Room 204 at 8:27 PM."
                );

            } else {

                result.setText(
                        "That is not the correct suspect.\n" +
                        "Review the evidence and statements carefully!"
                );
            }
        });

        Button backButton = new Button("BACK TO INVESTIGATION");

        backButton.setOnAction(e ->
                showInvestigation(stage)
        );

        VBox layout = new VBox(20);

        layout.setStyle(
                "-fx-padding: 40;" +
                "-fx-alignment: center;"
        );

        layout.getChildren().addAll(
                title,
                question,
                suspectBox,
                submitButton,
                result,
                backButton
        );

        stage.setScene(
                new Scene(layout, 700, 500)
        );
    }


    public static void main(String[] args) {
        launch(args);
    }
}