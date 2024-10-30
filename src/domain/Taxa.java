package domain;

public enum Taxa {
    CONTA_FISICA {
        @Override
        public double calcularTaxa(double valor) {
            return valor * 0.05;
        }
    },
    CONTA_JURIDICA {
        @Override
        public double calcularTaxa(double valor) {
            return valor * 0.10;
        }
    };

    public abstract double calcularTaxa(double valor);
}
