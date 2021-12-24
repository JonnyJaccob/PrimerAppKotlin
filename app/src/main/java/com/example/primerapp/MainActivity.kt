package com.example.primerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstant()
        TiposDatos()
        SentenciaIf()
        Arreglos()
        MapaDiccionario()
    }
    private fun variablesYConstant()
    {
        //Commentario
        //Variable
        var myVariable = "Hello Boy"
        var myNumero = 1
        println(myVariable)
        println(myNumero)
        //constante
        val myConstante = "Esto es una constante"
        
    }
    private fun TiposDatos() {
        //string
        val myString: String = "Hola"
        val myString1 = "otro"
        val myString3 = myString + " " + myString1
        val myString4 = "$myString $myString1"

        //Enteros (Byte, Short, Int, Long)
        val myINT1: Int = 1
        val myInt2 = 1
        val myInt3 = myINT1 + myInt2

        //Decimales (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble1: Double = 1.5

        //Boolean (Bool)
        val myBool: Boolean = false
        val myBoolV = true

    }
    private fun SentenciaIf()
    {
        //<
        //>
        //>=
        //<=
        //==
        //!=
        var myNumber = 2
        if(myNumber >2)
        {

        }else
        {
            //&&
            //||
            //!
            if(myNumber ==2 )
            {

            }else if(myNumber <2 || myNumber >10)
            {

            }else
            {

            }
        }
        //when
        //when = switch
        var country = "Mexico"
        when(country)
        {
            "España" ->{
                //mensaje
            }
            "Mexico" ->{

            }
            else ->{
                //Esto es como si fuera un default
            }
        }
        var edad = 1
        when(edad)
        {
            0,1,2 ->{

            }
            3 ->{

            }
            else->
            {

            }
        }
    }
    fun Arreglos()
    {
        //datos string
        val nombre = "lalo"
        val direccion = "principe"

        //array
        val myArray = arrayListOf<String>()
        //añadir datos
        myArray.add("$nombre")
        myArray.add(direccion)

        //output [lalo, principe]
        println("$myArray")

        //introducir varios a la vez
        myArray.addAll(listOf(nombre,direccion))
        //output [lalo, principe, lalo, principe]
        println("$myArray[0]")
        // output lalo
        //modiifcarlo es igual
        //borrar elemento
        myArray.removeAt(1)

        //recorrer datos
        myArray.forEach {
            println(it)
            //imprime el elemento it
        }
    }
    fun MapaDiccionario()
    {
        //el array es ordenado
        //el map sera por gruṕos y mismo tipo de datos y no existen claves repetidas
        var myMap: Map<String,Int> = mapOf()

        println(myMap)//output {}
        //Añadir elementos
        myMap = mapOf("Brains" to 1, "body" to 2)//al meter un mapOf se limpia y se introduce el nuevo
        println(myMap)// output {Brains=1, body=2 }
        //Añadir un solo valor
        var myMutableMap:Map<String, Int> = mutableMapOf("Brains" to 0)//puesto por primera vez
        myMutableMap = mutableMapOf("Brains" to 1)//se borra y se agrega uno actualizado
        myMutableMap["Leg"] = 7 //manera 1
        myMutableMap.put("Maria",8)//manera 2
        myMutableMap.put("bryan",3)
        myMutableMap.put("luis",3)
        println(myMutableMap) //output {Brians=1, body=2,bryan=3,luis=3,Leg=7,Maria=8}

        println(myMutableMap["Brains"])//acceso a un dato

        //eliminar dato
        myMutableMap.remove("Brains")
    }
    private fun loops()
    {
        //bucles
        val myArray = arrayListOf<String>()
        //myArray.add("${nombre}")
        var myMap = mapOf("Brains" to 1, "body" to 2)
        //for
        for(myString in myArray)
        {
            println(myString)
        }
        for(myElement in myMap)
        {
            println("${myElement.key}-${myElement.value}")
        }
        //cantidad de veces
        for(x in 0..10)
        {
            println(x)
        }
        for(x in 0 until 10)//no toma en cuenta el ultimo numero
        {
            println(x)
        }
        for(x in 0..10 step 2)
        {
            println(x)//0,2,4...
        }
        for(x in 10 downTo 0 )
        {
            println(x)//10,9,8,7...
        }
        val myNumericArray:IntRange = (0..10)
        for(myNumber:Int in myNumericArray)
        {
            println("${myNumber}")
        }
        //While
        var x = 0
        while (x<10 )
        {
            println("${x}")
            x++
        }
    }
    private fun NullSafety()
    {
        //seguridad contra nulos
        // variable null safety
        var myString: String? = "MouseDev"
        myString = null
        println(myString)//output: null
        myString = "no nulo"
        println(myString)//output: no nulo
        if(myString != null)
        {
            println(myString!!)// !! comprueba que no sea nulo
        }
            //safe calls
        println(myString!!.length)//esta sea distinta de nulo
        println(myString?.length)//si es nulo no lo ejecuta y el numero de letras
        myString?.let{
            println(it)//it:String //asi se ejecutara cuando no sea nulo
        }?: run{
            println(myString)//Se ejecutara cuando sea nulo
        }

    }
}