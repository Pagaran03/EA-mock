package com.mycompany.ecommerce_advance;
import java.util.*;
/**
 *
 * @author USER
 */
import java.util.*;
public class Program {
    private List<Userlist>userList = new ArrayList<>();
    private List<items>itemList = new ArrayList<>();
    private List<cart>addtoCart = new ArrayList<>();
    static int ID, AGE,sum;
    static String NAME,EMAIL,USERNAME,PASSWORD,confirmPass,loginUser,loginPass,CARTNAME,ADDRESS;
    static String currentsessionuser,currentsessionpass;
    static String PRODNAME;
    static int PRICE,CARTPRICE;
    static char charlang;
    static Scanner scan = new Scanner(System.in);

    // DIRI MAG INPUT ANG USER PARA SA IYANG PERSONAL INFORMATION
    // LIKE NAME EMAIL UG PASS
    private void addUser(){
        scan.nextLine();
        System.out.print("Enter Name: ");
        NAME = scan.nextLine();
        System.out.print("Enter Age: ");
        AGE = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Email: ");
        EMAIL = scan.nextLine();
        System.out.print("Enter Address: ");
        ADDRESS = scan.nextLine();
        System.out.print("Enter Username: ");
        USERNAME = scan.nextLine();
        System.out.print("Enter Password: ");
        PASSWORD = scan.nextLine();
        System.out.print("Please Confirm your Password: ");
        confirmPass = scan.nextLine();

    } 

    // MAO NEY VALIDATION PARA I CONFIRM IF ANG PASSWORD NGA GI INPUT
    // IS SAME BA SA CONFIRM PASSWORD
    private Userlist Confirm(){
        addUser();
        Userlist users = new Userlist(ID, NAME, AGE, USERNAME, EMAIL, ADDRESS, PASSWORD);
        if(PASSWORD.equals(confirmPass)){
        userList.add(users);
        System.out.print("\n\n  Successfully signed-up  \n\n");
        RunMe();
        }
        else{
            System.out.println("\nPassword Not The Same\n");
            addUser();
        }
        return users;
    }


    /* DIRI  DAAYUN  ANG KATONG LOGIN LOGIN
     * MANGAYO SIYA UG USERNAME UG PASSWORD
     * MAG ITERATE SIYA OR IYANG I SEARCH ANG
     * LIST SA DATA NGA GI INPUT IF ANG
     * USERNAME NGA IMONG GI INPUT IS NAG MATCH BA
     * DADTO SA MGA NAKA SET NGA DATA OR DATA NGA GIPANG
     * INPUT. IF ANG DATA NGA GI INPUT IS DILI MATCH
     * SA DATA NGA NAKA SET SA ARRAYLIST MAG SEND SIYA
     * UG MESSAGE NGA INVALID CREDENTIALS
     * PERO IF MATCH GANI IYA KANG I PADALA SA HOMEPAGE()
     * NGA FUNCTION.
    */
    private void Login(){
        scan.nextLine();
        System.out.print("Enter Username or Email: ");
        loginUser = scan.nextLine();
        System.out.print("Enter Password: ");
        loginPass = scan.nextLine();
        
        for(Userlist users : userList){
            if(users.getUSERNAME().equals(loginUser) && users.getPASSWORD().equals(loginPass)){
                CurrentSession();
                Homepage();
            }
            else if(!users.getUSERNAME().equals(loginUser) && !users.getPASSWORD().equals(loginPass)){
                System.out.println("INVALID CREDENTIALS");
            }
        }
    }


    /*DIRI I SET SA IMONG PROGRAM TONG IMONG
     * GI INPUT NGA CREDENTIALS SA LOGIN
     * PARA INIG PRINT KATO RA NGA DATA
     * ANG IYANG PANGITAON SA LIST IF EVER
     * GUSTO NIMO MA KITA ANG IMONG PERSONAL DATA
     */
    private void CurrentSession(){
        currentsessionuser = loginUser;
        currentsessionpass = loginPass;
    }


    /*MAO NI SIYA ANG IMONG HOMEPAGE BAY
     * DIRI KA MAG PILI SA KATONG MGA CHOICES NGA NAA DIRI
     */
    private void Homepage(){
        int choose = 0;
       while(choose != 5){
        System.out.println("\n\n");
        System.out.println("+----------------------------------+");
        System.out.println("|       WELCOME DEAR CUSTOMER      |");
        System.out.println("+----------------------------------+");
        System.out.println("|------What do you want to do?-----|");
        System.out.println("+ 1. Show User Information         +");
        System.out.println("|                                  |");
        System.out.println("+ 2. Show Item List                +");
        System.out.println("|                                  |");
        System.out.println("+ 3. Go Shopping                   +");
        System.out.println("|                                  |");
        System.out.println("+ 4. Cart Items                    +");
        System.out.println("|                                  |");
        System.out.println("+ 5. Logout                        +");
        System.out.println("+----------------------------------+\n\n");
        System.out.print("Option: "); choose = scan.nextInt();
      
           
        switch(choose){
            case 1: Print(); break;
            case 2: ItemList(); break;
            case 3: AddtoCart(); break;
            case 4: addtocart(); break;
            case 5: RunMe(); break;
        }
       }
    }


    /*DIRI DAYUN ANG ADD TO CART
     * MAG PILI KA UG KATONG MGA ITEM
     * ONCE MAKA PILI KA, KATONG MGA ITEM NGA IMONG
     * GIPANG PILI MA SEND TO SYA SA GETTERS SETTERS SA CART
     * DADTO NIYA I SET ANG MGA DATA SA ITEMS NGA IMONG GI PANG PIILI
     * LIKE PRODUCT NAME UG PRICE.
     * IF OK NAKA SA MGA ITEMS NGA IMONG GI PANG PILI
     * PWEDE NAKA MO PROCEED SA CHECKOUT
     */
    private void AddtoCart(){
        ProductList();
      int choice = 0;
      System.out.print("Enter the Number of the Product you want to buy\nIf you are done picking press 6 to checkout items.\nOption: ");
      for(int i = 0; i<itemList.size(); i++){
        System.out.print("\n"+ i +"." + " " + itemList.get(i).getProdName() + " = " + itemList.get(i).getPrice() + "\n");
      }
      
      while(choice != 99){
       
        System.out.println("\n\n+----------------------------------+");
        System.out.println("|                                  |");
        System.out.println("+       LIST OF ITEMS ABOVE        +");
        System.out.println("|                                  |");
        System.out.println("+  CHOOSE FROM NUMBER 0-4 FOR ITEM +");
        System.out.println("|                                  |");
        System.out.println("+  PRESS [5] TO ADD IT ON CART     +");
        System.out.println("|                                  |");
        System.out.println("+  PRESS [6] FOR CHECKOUT          +");
        System.out.println("|                                  |");
        System.out.println("+  PRESS [7] TO GO HOMEPAGE        +");
        System.out.println("|                                  |");
        System.out.println("+----------------------------------+\n");
        System.out.print("Option: "); choice = scan.nextInt();
      
      switch(choice){
        case 0: 
        CARTNAME = itemList.get(choice).getProdName();
        CARTPRICE = itemList.get(choice).getPrice();
        cart addcart0 = new cart(CARTPRICE, CARTNAME);
        addtoCart.add(addcart0);
        break;
        
         case 1: 
            CARTNAME = itemList.get(choice).getProdName();
            CARTPRICE = itemList.get(choice).getPrice();
            cart addcart1 = new cart(CARTPRICE, CARTNAME);
            addtoCart.add(addcart1);
            break;
        

        case 2:  
        CARTNAME = itemList.get(choice).getProdName();
        CARTPRICE = itemList.get(choice).getPrice();
        cart addcart2 = new cart(CARTPRICE, CARTNAME);
        addtoCart.add(addcart2);
            break;

        case 3:  
        CARTNAME = itemList.get(choice).getProdName();
        CARTPRICE = itemList.get(choice).getPrice();
        cart addcart3 = new cart(CARTPRICE, CARTNAME);
        addtoCart.add(addcart3);
                break;

        case 4: 
        CARTNAME = itemList.get(choice).getProdName();
        CARTPRICE = itemList.get(choice).getPrice();
        cart addcart4 = new cart(CARTPRICE, CARTNAME);
        addtoCart.add(addcart4);
            break;

        case 5:       
        System.out.println("\n\nProducts in your cart: ");
        for(cart carts : addtoCart){
            System.out.println("Product Name: " + carts.getCartName()
            + "\nProduct Price: " + carts.getCartPrice() + "\n");
        }
        break;

        case 6: 
    
        System.out.println("\n\n+----------------------------------+");
        System.out.println("|                                  |");
        System.out.println("|-YOU WANT TO PROCEED TO CHECKOUT?-|");
        System.out.println("+                                  +");
        System.out.println("|                                  |");
        System.out.println("+  PRESS [Y] IF YES                +");
        System.out.println("|                                  |");
        System.out.println("+  PRESS [N] IF NO                 +");
        System.out.println("|                                  |");
        System.out.println("+                                  +");
        System.out.println("+----------------------------------+\n");
        System.out.print("Input: ");
                scan.nextLine();
               choice = scan.next().charAt(0);
                switch(choice){
                    case 'Y' :
                    case 'y' :    
                System.out.println("+--------------------------------------------------+");
                System.out.println("|               SECRET SHOP RECEIPT                |");
                System.out.println("|   Villarin Street, Carmen, Cagayan de Oro City   |");
                System.out.println("|               CUSTOMER INVOICE                   |");
                System.out.println("+--------------------------------------------------+");
                System.out.println("|  Cashier Name: Brecht                            |");
                System.out.println("|  INVOICE NO: 458-80-108                          |");
                System.out.println("+--------------------------------------------------+");
                System.out.println("|  Customer Name: " + currentsessionuser + "       |");
                System.out.println("+  Customer Address: " + ADDRESS  + "              +");
                System.out.println("|--------------------------------------------------|");
                for(cart items : addtoCart){
                System.out.println(items.getCartName() + " = " + items.getCartPrice());
             //   System.out.println("+--------------------------------------------------+");
             //   System.out.println("|  Total Amount: "+sum+" Peso/s                    |");
             //   System.out.println("+  Thank you for purchasing                        +");
             //   System.out.println("|  Have a good day!                                |");
             //   System.out.println("+--------------------------------------------------+");
                }
                CheckOut();
                addtoCart.clear();
                Homepage();
                break;
                case 'N': break;
                case 'n': break;
                
                }
        case 7:
            Homepage();break;
                
        }
       
      }

    }


    /*KINI SIYA NGA PART SA CODE IS MAO NI ANG MAG ADD SA TOTAL VALUE SA IMONG MGA ITEM
     * KIBALI STARTING NIYA IS SUM = 0;
     * MAG SCAN NA SIYA SA LIST OF PRICES ATONG MGA ITEMS NGA GIPANG PILI NIMO
     * IYA NANG ISA ISA HON UG BUTANG 
     * FOR EXAMPLE ANG MGA PRICES KAY 10,20,30
     * ANG MAHITABO ANA KAY SUM = 0 + 10 = 10;
     * SUM 10 + 20 = 30;
     * SUM 30 + 30 = 60;
     * SO KIBALI ANG TOTAL TANAN SA ITEM IS 60;
     */
    private int CheckOut(){
            sum = 0;
           for(cart total : addtoCart){
            sum += total.getCartPrice();        
           }

       
        System.out.println("\n+-------------------------------------------------+");
        System.out.println("|                                                  |");
        System.out.println("+  Total Amount: "+sum+" Peso/s                     +");
        System.out.println("|                                                  |");
        System.out.println("+  PRICE OF ALL ITEMS THAT YOU'VE ADD TO CART      +");
        System.out.println("|                                                  |");
        System.out.println("+  HAVE A NICE DAY!                                +");
        System.out.println("+--------------------------------------------------+\n");
           return sum;
    }
    //DRI MA SAVE ANG IMONG GIPANG ADD TO CART
    private void addtocart(){
        System.out.println("\n\nProducts in your cart: ");
        for(cart carts : addtoCart){
            System.out.println("Product Name: " + carts.getCartName()
            + "\nProduct Price: " + carts.getCartPrice() + "\n");
        }
    }
    /*MAG SCAN OR ITERATE NI SIYA SA TANAN USERS
     * AND IF ANG USERNAME IS MATCH SA CURRENTSESSIONUSER
     * IYANG I PRINT ANG DETAILS ANA NGA USER
     */
    private void Print(){
        for(Userlist users : userList){
            if(users.getUSERNAME().equals(currentsessionuser)){
                System.out.println("\n\n\nName: " + users.getNAME()
                + "\nAge:     " + users.getAGE()
                + "\nAddress: " + users.getADDRESS()
                +"\nUsername: " + users.getUSERNAME()
                +"\nEmail:    " + users.getEMAIL());
            }
        }
    }


    /*MAO NI ANG PRODUCT LIST.
     * DIRI RAMO MAG ADD UG MGA PRODUCTS UG PRICES
     * TAPOS MAG ITERATE MO ANANG ARRAY PARA MAOY I SET NINYO AS ARRAYLIST VALUE
     * PARA SA INYONG ITEMLIST
     */
    private void ProductList(){
        String []Itemname  = {"ADATA 1TB HD330 DURABLE EXTERNAL HDD BLK" , "PC RX6600XT RED DEVIL 8GB GDRR6 128BIT Graphics Card" , "PC RX6500XT ITX 4GB GDDR6 64BIT Graphics Card" , "PC RX6400 (4GBD6-DH) 4GB GDDR6 64BIT Graphics Card" , "PALIT RTX3070TI GAME ROCK 8GB GDDR6 256BIT Graphics Card"};
        int []itemPrice = {2400,26000,13650,10350,45000};
        for(int i = 0, j=0; i<Itemname.length && j<itemPrice.length; i++ , j++){
        //for(int i = 0; i<Itemname.length; i++ && int j = 0; j<itemPrice.length; j++ )
                PRODNAME = Itemname[i];
                PRICE = itemPrice[j];
               items item = new items(PRICE, PRODNAME);
                itemList.add(item);
        }
    }


    /*PRINT RANI SIYA SA MGA ITEMS NGA NAKA LISTA SA PRODUCTLIST */
    private void ItemList(){
        ProductList();
        
        System.out.println("\n\n+------------------------------------------------------------------------+");
        System.out.println("|                              ITEMS LIST                                |");
        System.out.println("+------------------------------------------------------------------------+");
        for(items item : itemList){
        System.out.println("| Product Name: " + item.getProdName()
        + "\n| Price: " + item.getPrice());
        System.out.println("|------------------------------------------------------------------------|");

        }
    }


    /*MURA NI SIYA KIBALI UG MAINFUNCTION PERO LAHI LANG ANG VARIABLE NAME
     * MAG ASK SIYA IF NAA BA KAY ACCOUNT OR WALA
     * IF NAA PROCEED SA LOGIN
     * IF WALA PROCEED SA ADDUSER
     */
    public void RunMe(){
       while(charlang != 'e'){
        
        System.out.println("\n\n");
        System.out.println("+----------------------------------+");
        System.out.println("|      WELCOME TO SECRET SHOP      |");
        System.out.println("+----------------------------------+");
        System.out.println("|-----ALREADY HAVE AN ACCOUNT?-----|");
        System.out.println("+                                  +");
        System.out.println("|                                  |");
        System.out.println("+  PRESS [Y] IF YES                +");
        System.out.println("|                                  |");
        System.out.println("+  PRESS [N] IF NO                 +");
        System.out.println("|                                  |");
        System.out.println("+  PRESS [E] FOR EXIT              +");
        System.out.println("|                                  |");
        System.out.println("+                                  +");
        System.out.println("+----------------------------------+\n");
        System.out.print("Option: "); charlang = scan.next().charAt(0);
        System.out.println("                                   \n\n ");
            switch(charlang){
            case 'Y': Login(); break;
            case 'y': Login(); break;
            case 'N': Confirm(); break;
            case 'n': Confirm(); break;
            case 'E': System.exit(0);
            case 'e': System.exit(0);
            }
       }

    }

    
}