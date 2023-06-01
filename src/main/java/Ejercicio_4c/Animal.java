package Ejercicio_4c;

public abstract class Animal {
    protected String sonido; /* Atributo que identifica el sonido emitido
    por un animal */
    protected String alimentos; /* Atributo que identifica los alimentos
    que consume un animal */
    protected String hábitat; /* Atributo que identifica el hábitat de un
    animal */
    protected String nombreCientífico; /* Atributo que identifica el
    nombre científico de un animal */
    
    public abstract String getNombreCientifico();
    
    public abstract String getSonido();
    
    public abstract String getAlimentos();
    
    public abstract String getHabitat();
}
