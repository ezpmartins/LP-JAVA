public enum Simbolo {
    AS ("A",1),
    DOIS("2",2),
    TRES("3",3),
    QUATRO("4",4),
    CINCO("5",5),
    SEIS("6",6),
    SETE("7",7),
    OITO("8",8),
    NOVE("9",9),
    DEZ("10",10),
    VALETE("J",11),
    DAMA("Q",12),
    REI("K",13);

    private final String figura;
    private final Integer valor;

    Simbolo(String figura,Integer valor) {
       this.figura = figura;
       this.valor = valor;
    }

    public String getFigura() {
        return figura;
    }

    public Integer getValor() {
        return valor;
    }
}
