public class Picareta {

    String material;
    int durabilidade;
    int forca;

    Picareta(String material, int durabilidade, int forca) {
        this.material = material;
        this.durabilidade = durabilidade;
        this.forca = forca;
    }

    void mostrarInfo() {
        System.out.format(" - Picareta de %s com durabilidade de %d e força %d.\n", material, durabilidade, forca);
    }
     String fabricarPicareta(Picareta picareta) {
        System.out.println("\n=== FABRICANDO PICARETA ===");
        System.out.println("Material: " + picareta.material);
        System.out.println("Durabilidade: " + picareta.durabilidade);
        System.out.println("Força: " + picareta.forca);

        if (picareta.durabilidade <= 0 || picareta.forca <= 0) {
            System.out.println(" Picareta inválida!");
            return null;
        }

        System.out.println("Picareta de " + picareta.material + " fabricada com sucesso!");
        return "Picareta de " + picareta.material + " (D: " + picareta.durabilidade + ", F: " + picareta.forca + ")";
    }

    int minerar(Picareta picareta, int blocos) {
        System.out.println("\n=== MINERANDO COM PICARETA DE " + material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + picareta.durabilidade);
        System.out.println("Força: " + picareta.forca);
        System.out.println("Blocos a minerar: " + blocos);

        if (picareta.durabilidade <= 0) {
            System.out.println("Picareta quebrada!");
            return 0;
        }
        int blocosMinerados = 0;
        //int durabilidadeRestante = durabilidade;

        for (int i = 0; i < blocos; i++) {
            if (picareta.durabilidade <= 0) {
                System.out.println(" Picareta quebrou no bloco " + (i + 1));
                break;
            }
            picareta.durabilidade--;
            blocosMinerados++;

            System.out.println("\nMinerados " + blocosMinerados + " blocos");
            System.out.println("Durabilidade restante: " + picareta.durabilidade);

            if (picareta.durabilidade <= 0) {
                System.out.println(" A picareta de " + material + " quebrou completamente!");
            }
        }
        return blocosMinerados;
    }

    int repararPicareta(Picareta picareta, int quantidade) {
        System.out.println("\n=== REPARANDO PICARETA DE " + material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + picareta.durabilidade);
        System.out.println("Quantidade a reparar: " + quantidade);

        //int durabilidadeNova = picareta.durabilidade + quantidade;
        int limiteMaximo = 0;

        switch (material.toLowerCase()) {
            case "madeira": limiteMaximo = 50; break;
            case "pedra": limiteMaximo = 70; break;
            case "ferro": limiteMaximo = 100; break;
            case "ouro": limiteMaximo = 30; break;
            case "diamante": limiteMaximo = 160; break;
            default: limiteMaximo = 60;
        }

        picareta.durabilidade += quantidade;

        if (picareta.durabilidade > limiteMaximo) {
            System.out.println("Reparo limitado a " + limiteMaximo);
            picareta.durabilidade = limiteMaximo;
        }

        System.out.println("Durabilidade nova: " + picareta.durabilidade);
        return picareta.durabilidade;
    }

}

