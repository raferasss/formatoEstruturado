package org.example.code;

class VeiculoEletrico {
        private String modelo;
        private String marca;
        private int autonomiaKm;
        private int velocidadeMaxKmh;
        private double precoSugerido;

        public VeiculoEletrico(String modelo, String marca, int autonomiaKm, int velocidadeMaxKmh, double precoSugerido) {
            this.modelo = modelo;
            this.marca = marca;
            this.autonomiaKm = autonomiaKm;
            this.velocidadeMaxKmh = velocidadeMaxKmh;
            this.precoSugerido = precoSugerido;
        }

    public VeiculoEletrico() {

    }

    public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getAutonomiaKm() {
            return autonomiaKm;
        }

        public void setAutonomiaKm(int autonomiaKm) {
            this.autonomiaKm = autonomiaKm;
        }

        public int getVelocidadeMaxKmh() {
            return velocidadeMaxKmh;
        }

        public void setVelocidadeMaxKmh(int velocidadeMaxKmh) {
            this.velocidadeMaxKmh = velocidadeMaxKmh;
        }

        public double getPrecoSugerido() {
            return precoSugerido;
        }

        public void setPrecoSugerido(double precoSugerido) {
            this.precoSugerido = precoSugerido;
        }

    }

