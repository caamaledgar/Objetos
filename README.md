# Objetos

Proyecto para la clase de Aplicaciones Móviles para el Instituto Tecnólogico de Chiná, con el objetivo de reforzar el conocimiento del paradigma de la Programación Orientada a Objetos

Paradigmas de la Programación 

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/paradigmasProgramacionObjetos.png)


¿Qué es un Objeto?

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/queEsUnObjeto.png)


Paquete

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/Objeto.png)


Repesentación de Objetos

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/clases.png)


Para crear un Objeto en Java, y propiamente en Android Studio, siguiendo los principios de una programación por modelos, crearemos un paquete denominado clases

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/objetoLavadora.png)



 Inicialmente solo crearemos dos atributos: marca y modelo, estos atributos son de tipo String
 ````
 public class Lavadora {
    // Atributos
    private String marca;
    private String modelo;
}
````

En la misma clase, porterior a crear los atributos, es necesario crear los constructores, para que los objetos pudan instanciarse, unos sin parámetros y otro con los parámetros que queremos ingresar al objeto de manera directa.

Para ello podemos ayudarnos del IDE, para que él nos genere el código, con el botón contextual del mouse, o click izquierdo, se habilita este menú

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/menuContextual.png)

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/generator.png)


````
    // Constructores
    public Lavadora() {
    }

    public Lavadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
````


Para poder registrar y extraer los valores en nuesto objeto es necesario crear los métos getter y setter

````
    // Getter & Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
````

Como un método adicional que nos puede servir para traer los valores con los que nuestro objeto cuenta en un momento de su ciclo de vida, podemos crear el toString

````
    // ToString
    @Override
    public String toString() {
        return "Lavadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
````

Una vez creado nuestro objeto ya podemos trabajarlos en nuesto MainActivity
Usando la primera forma del constructor, sin parámetros

````
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Creando una instancia de nuestro objeto
        Lavadora lavadora   = new Lavadora();

        lavadora.setMarca("Mabe");
        lavadora.setModelo("Lavado Autómatico");

        Log.d("Objeto lavadora", lavadora.toString());
        
    }
}
````

En la sección del Run, en la parte inferior a través del evento Log, podemos visualizar nuestro objeto instanciado con los valores que les asignamos

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/runObjeto.png)

A través de nuestro objeto podemos generar nuevas instancias de él, ahora lo crearemos y le asignaremos valores en un mismo paso, utilizando en otro constructor

````
        //Creando una segunda instancia de nuestro objeto
        Lavadora lavadoraSecadora = new Lavadora("IEM", "Secado Automático");
        Log.d("Objeto lavadora-Secadora", lavadoraSecadora.toString());

````

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/runObjeto1y2.png)

El código completo quedaría de esta forma:

````
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Creando una instancia de nuestro objeto
        Lavadora lavadora   = new Lavadora();
        lavadora.setMarca("Mabe");
        lavadora.setModelo("Lavado Autómatico");
        Log.d("Objeto lavadora", lavadora.toString());

        //Creando una segunda instancia de nuestro objeto
        Lavadora lavadoraSecadora = new Lavadora("IEM", "Secado Automático");
        Log.d("Objeto lavadora-Secadora", lavadoraSecadora.toString());
        
    }
}

````







