package co.edu.uniquindio.poo;

public record Mascota(String nombre, int edad, String especie, String raza, String genero, String color, Double peso) {

    public Mascota{

        assert nombre!= null;
        assert edad >= 0;
        assert raza !=null;
        assert genero!=null;
        assert color!=null;
        assert peso>=12.0;
        assert especie !=null;

    }

    }
