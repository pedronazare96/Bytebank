public interface Tributavel {
    public default double getValorImposto() {
        return 0;
    }
}
