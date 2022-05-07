package com.muyal.scientificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {

    lateinit var primaryTV : TextView
    lateinit var secondaryTV : TextView
    lateinit var acBtn : Button
    lateinit var cBtn : Button
    lateinit var brace1Btn : Button
    lateinit var brace2Btn : Button
    lateinit var sinBtn : Button
    lateinit var cosBtn : Button
    lateinit var tanBtn : Button
    lateinit var logBtn : Button
    lateinit var lnBtn : Button
    lateinit var factBtn : Button
    lateinit var squareBtn : Button
    lateinit var sqRootBtn : Button
    lateinit var invBtn : Button
    lateinit var Btn7 : Button
    lateinit var Btn8 : Button
    lateinit var Btn9 : Button
    lateinit var Btn4 : Button
    lateinit var Btn5 : Button
    lateinit var Btn6 : Button
    lateinit var Btn1 : Button
    lateinit var Btn2 : Button
    lateinit var Btn3 : Button
    lateinit var Btn0 : Button
    lateinit var Btnpie : Button
    lateinit var BtnPoint : Button
    lateinit var BtnMul : Button
    lateinit var BtnSub : Button
    lateinit var BtnAdd : Button
    lateinit var BtnEqual : Button
    lateinit var BtnDiv : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        primaryTV = findViewById(R.id.idTVPrimary)
        secondaryTV = findViewById(R.id.idTVSecondary)
        acBtn = findViewById(R.id.idBtnAC)
        cBtn = findViewById(R.id.idBtnC)
        brace1Btn = findViewById(R.id.idBtnBrac1)
        brace2Btn = findViewById(R.id.idBtnBrac2)
        sinBtn = findViewById(R.id.idBtnsin)
        cosBtn = findViewById(R.id.idBtncos)
        tanBtn = findViewById(R.id.idBtntan)
        logBtn = findViewById(R.id.idBtnlog)
        lnBtn = findViewById(R.id.idBtnln)
        factBtn = findViewById(R.id.idBtnfact)
        squareBtn = findViewById(R.id.idBtnSquare)
        sqRootBtn = findViewById(R.id.idBtnSqRoot)
        invBtn = findViewById(R.id.idBtnInv)
        Btnpie = findViewById(R.id.idBtnPie)
        BtnPoint = findViewById(R.id.idBtnDot)
        BtnMul = findViewById(R.id.idBtnMul)
        BtnSub = findViewById(R.id.idBtnSub)
        BtnAdd = findViewById(R.id.idBtnAdd)
        BtnEqual = findViewById(R.id.idBtnEqual)
        BtnDiv = findViewById(R.id.idBtnDiv)
        Btn1 = findViewById(R.id.idBtn1)
        Btn2 = findViewById(R.id.idBtn2)
        Btn3 = findViewById(R.id.idBtn3)
        Btn4 = findViewById(R.id.idBtn4)
        Btn5 = findViewById(R.id.idBtn5)
        Btn6 = findViewById(R.id.idBtn6)
        Btn7 = findViewById(R.id.idBtn7)
        Btn8 = findViewById(R.id.idBtn8)
        Btn9 = findViewById(R.id.idBtn9)
        Btn0 = findViewById(R.id.idBtn0)

        Btn0.setOnClickListener{
           primaryTV.text = (primaryTV.text.toString()+"0")
        }
        Btn1.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"1")
        }
        Btn2.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"2")
        }
        Btn3.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"3")
        }
        Btn4.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"4")
        }
        Btn5.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"5")
        }
        Btn6.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"6")
        }
        Btn7.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"7")
        }
        Btn8.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"8")
        }
        Btn9.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"9")
        }
        BtnPoint.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+".")
        }
        BtnAdd.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"+")
        }
        BtnDiv.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"/")
        }
        brace1Btn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"(")
        }
        brace2Btn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+")")
        }
        Btnpie.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"3.142")
            secondaryTV.text = (Btnpie.text.toString())
        }
        sinBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"sin")
        }
        cosBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"cos")
        }
        tanBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"tan")
        }
        invBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"^"+"(-1)")
        }
        lnBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"ln")
        }
        logBtn.setOnClickListener{
            primaryTV.text = (primaryTV.text.toString()+"log")
        }
        BtnSub.setOnClickListener{
            val str: String = primaryTV.text.toString()
            if(!str.get(index = str.length-1).equals("-")){
                primaryTV.text = (primaryTV.text.toString()+"-")
            }
        }
        BtnMul.setOnClickListener{
            val str: String = primaryTV.text.toString()
            if(!str.get(index = str.length-1).equals("*")){
                primaryTV.text = (primaryTV.text.toString()+"*")
            }
        }
       sqRootBtn.setOnClickListener {
           if(primaryTV.text.toString().isEmpty()){
               Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
           }else{
               val str: String = primaryTV.text.toString()
               val r = Math.sqrt(str.toDouble())
               val result = r.toString()
               primaryTV.text = result
           }
       }
        acBtn.setOnClickListener {
            primaryTV.text = ""
            secondaryTV.text = ""
        }
        cBtn.setOnClickListener {
            var str : String = primaryTV.text.toString()
            if (!str.equals("")){
                str = str.substring(0,str.length-1)
                primaryTV.text = str
            }
        }
        squareBtn.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }else{
                val d: Double= primaryTV.text.toString().toDouble()
                val square = d*d
                primaryTV.text = square.toString()
                secondaryTV.text = square.toString()
            }
        }
        factBtn.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter a valid number",Toast.LENGTH_SHORT).show()
            }else{
                val value : Int = primaryTV.text.toString().toInt()
                val fact : Int = factorial(value)
                primaryTV.text = fact.toString()
                secondaryTV.text = fact.toString()
            }
        }
        BtnEqual.setOnClickListener {
            val str : String = primaryTV.text.toString()
            val result : Double = evaluate(str)
            val r = result.toString()
            primaryTV.text = r
            secondaryTV.text = str
        }

    }

    fun factorial (n:Int) : Int{
        return if (n==1 || n==0 )1 else n* factorial(n-1)
    }

    fun evaluate(str: String): Double{
        return object : Any(){
            var pos = -1
            var ch = 0

            fun nextChar(){
                ch = if (++pos <str.length)str[pos].toInt()else -1
            }

            fun eat(charToEdt: Int): Boolean{
                while (ch==' '.toInt())nextChar()

                if (ch==charToEdt){
                    nextChar()
                    return true
                }
                return false
            }
            fun parse() : Double{
                nextChar()
                val x = parseExpression()
                if(pos<str.length) throw RuntimeException("Unexpected : "+ch.toString())
                return x
            }

            fun parseExpression(): Double{
                var x = parseTerm()
                while (true){
                    if (eat('+'.toInt()))x +=parseTerm()
                    else if (eat('-'.toInt()))x -= parseTerm()
                    else return x
                }
            }
            fun parseTerm(): Double{
                var x = parseFactor()
                while (true){
                    if (eat('*'.toInt()))x *=parseTerm()
                    else if (eat('/'.toInt()))x /= parseTerm()
                    else return x
                }
            }
            fun parseFactor(): Double {
                if (eat('+'.toInt())) return parseFactor()
                if (eat('-'.toInt())) return parseFactor()

                var x: Double
                val startPos = pos

                if (eat('('.toInt())) {
                    x = parseExpression()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()

                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                    while (ch>='a'.toInt() && ch<='z'.toInt())nextChar()
                    val func = str.substring(startPos, pos)
                    x = parseFactor()
                    x = if (func == "sqrt") Math.sqrt(x)
                    else if (func == "sin") Math.sin(Math.toRadians(x))
                    else if (func == "cos") Math.cos(Math.toRadians(x))
                    else if (func == "tan") Math.tan(Math.toRadians(x))
                    else if (func == "log") Math.log10(x)
                    else if (func == "ln") Math.log(x)
                    else throw RuntimeException(
                        "Unknown Exception : $func"
                    )
                }else {
                    throw RuntimeException("Unexpected : " + ch.toChar())
                }
                if (eat('^'.toInt())) x = Math.pow(x, parseFactor())
                return x
            }
        }.parse()
    }
}