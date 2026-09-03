public class Test {

    public static void main(String[] args) {

        Case detectiveCase =
                new Case("The Missing Diamond");

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

// Add suspect statements

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

        System.out.println(
                detectiveCase.getCaseName()
        );

        for (Suspect s : detectiveCase.getSuspects()) {

            System.out.println(
                    s.getName() + " - "
                    + s.getOccupation()
            );
        }

System.out.println("\nEvidence:");

for (Evidence e : detectiveCase.getEvidence()) {

    System.out.println(
        e.getId() + ". "
        + e.getTitle()
        + " - "
        + e.getLocation()
    );
}

System.out.println("STATEMENTS:");
System.out.println("---------------------------------");

for (Statement s : detectiveCase.getStatements()) {

    System.out.println(
            s.getSuspectName() + ":"
    );

    System.out.println(
            "\"" + s.getStatement() + "\""
    );

    System.out.println();
}
    }
}