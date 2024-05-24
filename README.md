<h1>Herencia</h1>

<p>La herencia en Java implica que una superclase o clase base hereda sus funciones y atributos a una subclase o clase derivada. La palabra reservada que nos permite realizar herencia entre clases es <code>extends</code>.</p>

<p>Cabe mencionar que en Java los constructores de las clases no se heredan; sin embargo, pueden ejecutarse en la clase hija con el método <code>super()</code>. Considera que las funciones o atributos del tipo <code>private</code> no podrán heredarse.</p>

<img src="https://halved-octave-804.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F3cb150ba-d23d-4291-a63d-d5329545e1db%2F7dd9f46d-1c4a-4227-9a15-fb7854b2070b%2FUntitled.png?table=block&id=7ac8ca2e-dfd2-4731-8670-66939a5afa67&spaceId=3cb150ba-d23d-4291-a63d-d5329545e1db&width=860&userId=&cache=v2" alt="Herencia en Java">


<h1>Encapsulamiento</h1>

<p>La encapsulación en Java es un principio fundamental de la POO que consiste en agrupar los datos (atributos) y los métodos (comportamientos) relacionados con un objeto dentro de una sola unidad, llamada clase. Además, se controla el acceso a estos datos y métodos, permitiendo únicamente interacciones controladas desde el exterior de la clase.</p>

<h3><strong>Private</strong></h3>

<p>El modificador de acceso <strong><code>private</code></strong> es el más restrictivo. Los miembros (atributos y métodos) declarados como <strong><code>private</code></strong> solo son accesibles dentro de la misma clase en la que se declaran. Esto significa que no pueden ser accedidos directamente desde otras clases, incluyendo las subclases (clases derivadas).</p>

<h3><strong>Public</strong></h3>

<p>El modificador de acceso <strong><code>public</code></strong> es el menos restrictivo. Los miembros declarados como <strong><code>public</code></strong> son accesibles desde cualquier otra clase, sin importar el paquete al que pertenezcan. Esto permite un acceso completo y sin restricciones a estos miembros desde cualquier parte del programa.</p>

<h3><strong>Protected</strong></h3>

<p>El modificador de acceso <strong><code>protected</code></strong> ofrece un nivel de acceso intermedio. Los miembros declarados como <strong><code>protected</code></strong> son accesibles dentro de la misma clase, en las subclases (clases derivadas), y en otras clases del mismo paquete. Esto permite un cierto nivel de encapsulación mientras facilita la herencia y el acceso dentro del mismo paquete.</p>


<h1>Polimorfismo</h1>

<p>"El polimorfismo hace referencia a la cualidad por la que un objeto adquiere o puede tener diferentes formas. En Java, el polimorfismo alude al modo en que se pueden crear y utilizar dos o más métodos con el mismo nombre para ejecutar funciones diferentes."</p>

<img src="https://halved-octave-804.notion.site/image/https%3A%2F%2Fprod-files-secure.s3.us-west-2.amazonaws.com%2F3cb150ba-d23d-4291-a63d-d5329545e1db%2Fe175cd82-129f-4cf5-8ff4-69ef85579042%2FUntitled.png?table=block&id=c2e4166f-0d46-4d79-8593-7991f73e8294&spaceId=3cb150ba-d23d-4291-a63d-d5329545e1db&width=580&userId=&cache=v2" alt="Herencia en Java">

<h2>Para qué sirve?</h2>

<p>Supongamos que tenemos una clase base <strong><code>Animal</code></strong> y dos clases derivadas <strong><code>Perro</code></strong> y <strong><code>Gato</code></strong>, que heredan de <strong><code>Animal</code></strong>. Cada una de estas clases tiene un método <strong><code>hacerSonido()</code></strong>, pero cada clase implementa este método de manera diferente.</p>


<h1>Sobrecarga</h1>

<p>En <strong>Java</strong>, dentro de una misma <strong>clase</strong> pueden definirse dos o más <strong>métodos</strong> con el <strong>mismo nombre</strong>, aunque la declaración de sus parámetros sea diferente. Cuando esto ocurre, se dice que los <strong>métodos</strong> están sobrecargados.</p>



<h2>Recursos</h2>

<p>Para más información, visita el siguiente enlace de Notion:</p>
<a href="https://halved-octave-804.notion.site/8242a91b628a4456807ff893546d76a6">Documentación en Notion</a>

<h2>Referencias</h2>

<p><strong>Herencia:</strong> HubSpot. (2022, diciembre 5). ¿Qué es la herencia en Java y cómo funciona? Actualizado: 16 de mayo de 2023. <a href="https://blog.hubspot.es/website/que-es-herencia-java#:~:text=La%20herencia%20en%20Java%20implica,herencia%20entre%20clases%20es%20extends">https://blog.hubspot.es/website/que-es-herencia-java#:~:text=La%20herencia%20en%20Java%20implica,herencia%20entre%20clases%20es%20extends</a>.</p>

<p><strong>Encapsulamiento:</strong> OpenWebinars. (2023, noviembre 10). Introducción a POO en Java: Encapsulamiento. <a href="https://openwebinars.net/blog/introduccion-a-poo-en-java-encapsulamiento/#:~:text=En%20Java%2C%20la%20encapsulación%20se,los%20objetos%20de%20esa%20clase">https://openwebinars.net/blog/introduccion-a-poo-en-java-encapsulamiento/#:~:text=En%20Java%2C%20la%20encapsulación%20se,los%20objetos%20de%20esa%20clase</a>.</p>

<p><strong>Encapsulamiento:</strong> HubSpot. (2022, diciembre 19). Polimorfismo en Java: ¿Qué es y cómo funciona? Actualizado: 16 de mayo de 2023. <a href="https://blog.hubspot.es/website/polimorfismo-java#:~:text=El%20polimorfismo%20hace%20referencia%20a,nombre%20para%20ejecutar%20funciones%20diferentes">https://blog.hubspot.es/website/polimorfismo-java#:~:text=El%20polimorfismo%20hace%20referencia%20a,nombre%20para%20ejecutar%20funciones%20diferentes</a>.</p>

<p><strong>Sobrecarga:</strong> PCResumen. (2019, 13 de septiembre). La sobrecarga de métodos en Java. Recuperado de <a href="https://www.pcresumen.com/menu-software/35-lenguajes-de-programacion/java/64-la-sobrecarga-de-metodos-en-java#:~:text=A%20Java%2C%20dentro%20de%20una,que%20los%20m%C3%A9todos%20est%C3%A1n%20sobrecargado">https://www.pcresumen.com/menu-software/35-lenguajes-de-programacion/java/64-la-sobrecarga-de-metodos-en-java#:~:text=A%20Java%2C%20dentro%20de%20una,que%20los%20m%C3%A9todos%20est%C3%A1n%20sobrecargado</a>.</p>