package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Tao so pi
    String pi = "3.14159265";
    //Tao cac bien button
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,bequal,bplus,bmin,bmul,bdiv,binv,bsqrt,bsquare,bfact,bln,blog,btan,bcos,bsin,bb1,bb2,bc,bac;
    TextView tvamin,tvsec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Anh xa den cac nut trong view
        b1 = findViewById(R.id.b1);
        b2 =findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);
        //man hinh chinh
        tvamin = findViewById(R.id.tvmain);
        //man hinh phu
        tvsec = findViewById(R.id.tvsec);
        // Gan gia tri ban dau la khong
        tvamin.setText("0");
        //Goi den nut so 1
        b1.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Thay doi man hinh chinh
                // Lay text mh chinh + text cua nut
                // reset lai man hinh chinh

                if(tvamin.getText() == "0")
                {
                    tvamin.setText("1");
                }
                else{
                    tvamin.setText(tvamin.getText()+"1");
                }

            }
        });
        //goi den nut so 2
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText("2");
                }
                else
                {
                    tvamin.setText(tvamin.getText()+"2");
                }

            }
        });
        //goi den nut so 3
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText("3");
                }
                else{
                    tvamin.setText(tvamin.getText()+"3");
                }

            }
        });
        //goi den nut so 4
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText("4");
                }
                else
                {
                    tvamin.setText(tvamin.getText()+"4");
                }

            }
        });
        //goi den nut so 5
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText("5");
                }
                else
                {
                    tvamin.setText(tvamin.getText()+"5");
                }

            }
        });
        //goi den nut so 6
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText("6");
                }
                else {
                    tvamin.setText(tvamin.getText()+"6");
                }

            }
        });
        //goi den nut so 7
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText("7");
                }
                else{
                    tvamin.setText(tvamin.getText()+"7");
                }

            }
        });
        //goi den nut so 8
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText("8");
                }
                else{
                    tvamin.setText(tvamin.getText()+"8");
                }

            }
        });
        //goi den nut so 9
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText("9");
                }
                else{
                    tvamin.setText(tvamin.getText()+"9");
                }

            }
        });
        //goi den nut so 0
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText("10");
                }
                else{
                    tvamin.setText(tvamin.getText()+"0");
                }

            }
        });
        // goi den nut dau "."
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvamin.setText(tvamin.getText()+".");
            }
        });
        // Button dung de xoa man hinh chinh va man hinh phu
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset ve rong
                tvamin.setText("0");
                //reset ve ring
                tvsec.setText("");
            }
        });
        //goi toi Button dung de xoa ki tu ngoai cung
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // khai bao bien val
                String val = tvamin.getText().toString();
                //tra ve chuoi con cua mot chuoi bat dau tu 0 den do dai -1
                val = val.substring(0,val.length()-1);
                //reset lai man hinh chinh
               tvamin.setText(val);
            }
        });
        //Button dung de cong
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvamin.setText(tvamin.getText()+"+");
            }
        });
        //Button dung de tru
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvamin.setText(tvamin.getText()+"-");
            }
        });
        //Button dung de nhan
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvamin.setText(tvamin.getText()+"??");
            }
        });
        //Button dung de chia
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvamin.setText(tvamin.getText()+"??");
            }
        });


            //Button dung de dung can thuc
            bsqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Khai bao bien tam

                    String temp = tvamin.getText().toString();
                    if(temp == "0")
                    {
                        tvamin.getText();
                    }
                    //Khai bao bien r
                    // r = can bac 2 cua temp
                    else {
                        double r = Math.sqrt(Double.parseDouble(temp)); // Doi string sang double
                        tvamin.setText((String.valueOf(r)));
                    }




                }
            });
            //Button mo dau ngoac
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText("(");
                }
                else {
                    tvamin.setText(tvamin.getText()+"(");
                }
            }
        });
        //Button dong dau ngoac
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() == "0")
                {
                    tvamin.setText(")");
                }
                else {
                    tvamin.setText(tvamin.getText()+")");
                }

            }
        });
        // pi
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() != null)
                {
                    tvsec.setText(bpi.getText());
                    tvamin.setText(pi);
                }
                else {
                    tvsec.setText(bpi.getText());
                    tvamin.setText(tvamin.getText()+pi);
                }

            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() != null)
                {
                    tvamin.setText("sin");
                }
                else
                {
                    tvamin.setText(tvamin.getText()+"sin");
                }

            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() != null)
                {
                    tvamin.setText("cos");
                }
                else
                {
                    tvamin.setText(tvamin.getText()+"cos");
                }

            }
        });
        // button dung de tinh tan
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() != null)
                {
                    tvamin.setText("tan");
                }
                else
                {
                    tvamin.setText(tvamin.getText()+"tan");
                }

            }
        });
        // button dung de tinh 1/x
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvamin.setText(tvamin.getText()+"^"+"(-1)");
            }
        });
        // ham tinh giai thua
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvamin.getText().toString());
                int fact = factorial(val);
                tvamin.setText((String.valueOf(fact)));
                tvsec.setText(val+"!");
            }
        });
        //ham tinh ln
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() != null)
                {
                    tvamin.setText("ln");
                }
                else {
                    tvamin.setText(tvamin.getText()+"ln");
                }

            }
        });
        //ham tinh binh phuong
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvamin.getText().toString());

                double square = d*d;
                tvamin.setText(String.valueOf(square));
                tvsec.setText(d+"??");
            }
        });

        //ham tinh log
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvamin.getText() != null)
                {
                    tvamin.setText("log");
                }
                else{
                    tvamin.setText(tvamin.getText()+"log");
                }

            }
        });

        //ham xuat ket qua
        bequal.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvamin.getText().toString();
                //Doi cac dau ?? thanh / , dau x thanh *
                String replacedstr = val.replace('??','/').replace('??','*');
                //goi ham eval
                double result = eval(replacedstr);
                //xuat ket qua
                tvamin.setText((String.valueOf(result)));
                tvsec.setText(val);
            }
        }));
    }
    //factorial function
    //Ham tinh giai thua
    int factorial(int n)
    {
        if(n == 1 || n ==0)
        {
            return 1 ;
        }
        else
        {
            return n*factorial(n-1);
        }

    }
     // ham eval
    public static double eval(final  String str)
    {
        //return ra Object
        return new Object(){
            // khai bao 2 bien pos =-1
            // khai bao bien ch
            int pos = -1, ch;
            void nextChar()
            {
                //t??ng v??? tr?? l??n 1
                // ki???m tra v???i ????? d??i str
                if(++pos < str.length())
                {
                    ch = str.charAt(pos); // tr??? v??? gi?? tr??? c?? ch??? s??? pos
                }
                else {
                    ch = -1;
                }

            }
            //ki???m tra ph???n t???
            boolean eat(int charToEat)
            {

                while (ch == ' ') nextChar();
                if (ch == charToEat){
                    nextChar();
                    return true;
                }
                return false;
            }

            //
            double parse()
            {
                nextChar();
                double x =  parseExpression();
                if (pos < str.length()) throw  new RuntimeException("Unexpected: " +(char)ch);
                return  x;
            }
            //H??m t??nh c???ng tr???
           double parseExpression() {
                double x = parseTerm();
                //
               for (;;){
                    if      (eat('+'))//N???u l?? d???u c???ng
                    {
                        x += parseTerm(); // C???ng
                    }

                    else if (eat('-')) //N???u l?? d???u tr??d
                    {
                        x -= parseTerm(); // tru
                    }

                    else
                    {
                        return x;
                    }
                }
            }

            //H??m t??nh nh??n chia
            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) //Ki???m tra n???u l?? nh??n
                    {
                        x *= parseFactor(); // nh??n
                    }
                    else if (eat('/')) //Ki???m tra n???u l?? chia
                    {
                        x /= parseFactor(); // chia
                    }
                    else return x; //n???u kh??ng return ra x
                }
            }
            double parseFactor() {
                if (eat('+'))
                    return parseFactor(); //s??? d????ng
                if (eat('-'))
                    return -parseFactor(); //s??? ??m

                double x;
                int startPos = this.pos; //v??? tr?? hi???n t???i c???a ph???n t???
                if (eat('(')) { // parentheses d???u ngo???c k??p
                    x = parseExpression();
                    eat(')'); // ????ng ngo???c
                } else if ((ch >= '0' && ch <= '9') || ch == '.') //Ki???m tra l?? xem c?? ph???i l?? s??? hay kh??ng
                {
                    // S???
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));//Tr??? v??? ?????i t?????ng chu???i t??? v??? tr?? start ?????n v??? tr?? this
                } else if (ch >= 'a' && ch <= 'z') {
                    // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    //So sanh chuoi
                    if (func.equals("sqrt")) // so s??nh chu???i func v???i sqrl
                        x = Math.sqrt(x); //can bac 2
                    else if (func.equals("sin")) //So s??nh chu???i func v???i
                        x = Math.sin(Math.toRadians(x)); // t??nh sin
                    else if (func.equals("cos")) //So s??nh chu???i func v???i chu???i "cos"
                        x = Math.cos(Math.toRadians(x)); //tinh cos
                    else if (func.equals("tan")) // so s??nh chu???i func v???i "tan"
                        //tinh tan
                        x = Math.tan(Math.toRadians(x));
                    //tinh log
                    else if (func.equals("log"))
                        //tinh log10(x)
                        x = Math.log10(x);
                    else if (func.equals("ln"))
                        //tinh log(x)
                        x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // B??nh ph????ng

                return x;
            }
        }.parse();
    }
}