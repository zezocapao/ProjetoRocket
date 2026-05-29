package JE12_POO.enums;

public enum EstadosBrasileiros {
    RS ("Rio Grande Do Sul", "RS"),
    SC ("Santa Catarina", "SC"),
    PR ("Parana", "PR")
    ;

    final private String NAME;
    final private String SIGLA;

    private EstadosBrasileiros(String name, String sigla){
        this.NAME = name;
        this.SIGLA = sigla;
    }

    public String getName() {
        return NAME;
    }

    public String getSigla() {
        return SIGLA;
    }
}
