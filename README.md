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

Ahora como actividad hagamos que estos objetos se muestren en nuestro dispositivo, para ello crearemos dos botones, que tendrán  la funci{on de mostrar la información en el TexView.

Primero hay que poner un ID al TextView dendro de nuestro archivo XML, para poder referenciarlo en le Activity Main

````
    <TextView
        android:id="@+id/tvMensaje"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textSize="18dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

````

Dentro del mismo Layout crearmos dos botones dentro de un LinearLayout
Note que el Boton para el objeto1 llamado btnObjeto1, cuenta con un atributo onClick
````
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_margin="20dp"
        android:padding="10dp"
        app:layout_constraintTop_toBottomOf="@+id/tvMensaje">
        <Button
            android:id="@+id/btnObjeto1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginRight="10dp"
            android:layout_weight="1"
            android:text="Objeto 1" />
        <Button
            android:id="@+id/btnObjeto2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="10dp"
            android:layout_weight="1"
            android:text="Objeto 2" />
    </LinearLayout>

````
Ya comtamos con lo necesario para que nuestra aplicación realice lo solicitado.
Así que ahora trabajamos en nuestro MainActivity.java


Primero instanciaremos nuestros objetos del XML, para poder referenciarlos desde la clase java
````
        //Instanciar los objetos de nuestro XML
        TextView textView = (TextView) findViewById(R.id.tvMensaje);
        Button btnObjeto1 = (Button) findViewById(R.id.btnObjeto1);
        Button btnObjeto2 = (Button) findViewById(R.id.btnObjeto2);

````

Despues añadiremos unos escuchas a nuestos objetos botones, con el método setOnClickListener
Para poder asignarle un valor a nuestro TextView, se utiliza en método setText
Añadimos que para el botón 1, se imprima el toString de lavadora y para el botón dos el toString de lavadoraSecadora

````
        btnObjeto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(lavadora.toString());
            }
        });

        btnObjeto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(lavadoraSecadora.toString());
            }
        });

````

Y vemos los resultados en nuestro dispositivo virtual

objeto 1

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/objeto1.png)


objeto2

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/objeto2.png)


Ahora aprenderemos a incorporar Imágenes obtenidas desde Internet, a nuestro proyecto, utilizando la libreria Glide.
En el archivo build.gradle de la app, se añade las dependencias de glide
    
````
dependencies{
    // Glide
    implementation 'com.github.bumptech.glide:glide:4.14.2'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.14.2'
}
````


Incluir en archivo AndroidManifiest.xml la funcionalidad para visualizar archivos desde Internet

````
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET" />
````

Modificar nuestro XML, para añadir un objeto de tipo ImageView, nuestro objeto debe tener un ID, para poder instanciarlo desde nuesto código Java
````
    <LinearLayout
        android:id="@+id/llcontenido1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/linearLayout">


        <ImageView
            android:id="@+id/ivlogo1"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/ic_launcher_foreground" />
    </LinearLayout>

````


Añadir la funcionalidad en nuestro Activity para consumir imágenes desde una URL

````
        // Crear variable para la URL de tipo String
        String urlLogoPrincipal;
        ImageView imageView = view.findViewById(R.id.ivlogo1);
        urlLogoPrincipal = "https://itchina.edu.mx/wp-content/uploads/2019/10/itchina-1.jpg";
        Glide.with(this)
             .load(urlLogoPrincipal)
             .error(getApplicationContext().getDrawable(android.R.drawable.presence_offline))
             .fitCenter()
             .circleCrop()
             .into(imageView);

````

Nota: Para trabajar Glide desde fragmentos utilizar la vista y el contexto de la vista
````
        Glide.with(view)
                .load(urlLogoPrincipal)
                .error(view.getContext().getDrawable(android.R.drawable.presence_offline))
                .fitCenter()
                .circleCrop()
                .into(imageView);
````

![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/imagenGlide1.png)

Ya traemos una imágen desde Internet
Añadamoles más contexto a nuestra Aplicación
Incluyamos 3 objetos de Tipo TextView para un título, subtitulo y descripciónm en nuestro XML, si bien los datos son HardCode, no sirven para ver de manera visual su comportamiento.

````
    <LinearLayout
        android:id="@+id/llcontenido1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/linearLayout">


        <ImageView
            android:id="@+id/ivlogo1"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/ic_launcher_foreground" />

        <LinearLayout
            android:layout_width="300dp"
            android:layout_height="wrap_content"
            android:orientation="vertical">
            <TextView
                android:id="@+id/tvCiudad1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textStyle="bold"
                android:layout_weight="1"
                android:text="Campeche" />

            <TextView
                android:id="@+id/tvDescripcion1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="Ciudad de las Murallas" />

            <TextView
                android:id="@+id/tvDetalle1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis commodi corporis dolor, eum illum magni maiores odio, omnis quod reprehenderit, sapiente tempore voluptatem! Delectus, voluptates" />

        </LinearLayout>
    </LinearLayout>
````


![](https://github.com/caamaledgar/documentationProjects/blob/main/objetos/imagenGlide1.png)




