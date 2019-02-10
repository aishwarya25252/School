import java.io.*;
class run
{   
    public static void main()throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        welcome();
        int f=0;
        System.out.println("\fENTER FROM THE FOLLOWING COMMANDS :=");
        System.out.println("ENTER 1 TO CREATE AN ACCOUNT\nENTER 2 TO DEPOSIT TO AN ACCOUNT\nENTER 3 TO WITHRAW FROM AN ACCOUNT\nENTER 4 TO VIEW YOUR ACCOUNT HISTORY\nENTER 5 TO EXIT FROM MENU");
        while(true)
        {
            int c=Integer.parseInt(br.readLine());
            switch(c)
            {
                case 1:
                create();
                System.out.println("\fPROCESS SUCCESSFUL\nENTER FROM THE FOLLOWING COMMANDS :=");
                System.out.println("ENTER 1 TO CREATE AN ACCOUNT\nENTER 2 TO DEPOSIT TO AN ACCOUNT\nENTER 3 TO WITHRAW FROM AN ACCOUNT\nENTER 4 TO VIEW YOUR ACCOUNT HISTORY\nENTER 5 TO EXIT FROM MENU");
                break;
                case 2:
                deposit();
                System.out.println("\fPROCESS SUCCESSFUL\nENTER FROM THE FOLLOWING COMMANDS :=");
                System.out.println("ENTER 1 TO CREATE AN ACCOUNT\nENTER 2 TO DEPOSIT TO AN ACCOUNT\nENTER 3 TO WITHRAW FROM AN ACCOUNT\nENTER 4 TO VIEW YOUR ACCOUNT HISTORY\nENTER 5 TO EXIT FROM MENU");
                break;
                case 3:
                withraw();
                System.out.println("\fPROCESS SUCCESSFUL\nENTER FROM THE FOLLOWING COMMANDS :=");
                System.out.println("ENTER 1 TO CREATE AN ACCOUNT\nENTER 2 TO DEPOSIT TO AN ACCOUNT\nENTER 3 TO WITHRAW FROM AN ACCOUNT\nENTER 4 TO VIEW YOUR ACCOUNT HISTORY\nENTER 5 TO EXIT FROM MENU");
                break;
                case 4:
                history();
                System.out.println("\fPROCESS SUCCESSFUL\nENTER FROM THE FOLLOWING COMMANDS :=");
                System.out.println("ENTER 1 TO CREATE AN ACCOUNT\nENTER 2 TO DEPOSIT TO AN ACCOUNT\nENTER 3 TO WITHRAW FROM AN ACCOUNT\nENTER 4 TO VIEW YOUR ACCOUNT HISTORY\nENTER 5 TO EXIT FROM MENU");
                break;
                case 5:
                f=1;
                break;
                default :
                System.out.println("\fWRONG INPUT\nENTER 1 TO CREATE AN ACCOUNT\nENTER 2 TO DEPOSIT TO AN ACCOUNT\nENTER 3 TO WITHRAW FROM AN ACCOUNT\nENTER 4 TO VIEW YOUR ACCOUNT HISTORY\nENTER 5 TO EXIT FROM MENU");
            }
            if(f==1)
                break;
        }
        System.out.print("EXITING..");
        for(int j=0;j<3;j++)
        { 
            for(long i=0;i<1000000000;i++);
            System.out.print("#");
        }
        System.out.println("\f------------THANK YOU FOR USING THIS SERVICE------------");
    }

    static void welcome()throws IOException
    {
        System.out.print("WELCOME TO THE BANK UPDATING SYSTEM\nLOADING..");
        for(int j=0;j<10;j++)
        { 
            for(long i=0;i<1000000000;i++);
            System.out.print("#");
        }
        System.out.println("\fSYSTEM LOADED:-");
        for(long i=0;i<2000000000;i++);
        System.out.print("\f");
        System.out.println("\t\t--------------------------------------------------\t\t\t\t\t-----------------------------------------------------");
        System.out.println("\t\t###              ### ########## ##        ##      \t\t\t\t\t  ######### #########     ##### ######     ##########");
        System.out.println("\t\t ###            ###  ##         ##        ##      \t\t\t\t\t  ##        ##     ##    ###  ###   ###    ##        ");
        System.out.println("\t\t  ###    #     ###   ######     ##        ##      \t\t\t\t\t  ##        ##     ##   ###    #     ###   ######    ");
        System.out.println("\t\t   ###  ###   ###    ##         ##        ##      \t\t\t\t\t  ##        ##     ##  ###            ###  ##        ");
        System.out.println("\t\t    ##### ######     ########## ######### ########\t\t\t\t\t  ######### ######### ###              ### ##########");
        System.out.println("\t\t--------------------------------------------------\t\t\t\t\t-----------------------------------------------------");
        for(long i=0;i<500000000;i++);
        System.out.print("\f");
        System.out.println("\t\t\t--------------------------------------------------\t\t\t\t-----------------------------------------------------");
        System.out.println("\t\t\t###              ### ########## ##        ##      \t\t\t\t  ######### #########     ##### ######     ##########");
        System.out.println("\t\t\t ###            ###  ##         ##        ##      \t\t\t\t  ##        ##     ##    ###  ###   ###    ##        ");
        System.out.println("\t\t\t  ###    #     ###   ######     ##        ##      \t\t\t\t  ##        ##     ##   ###    #     ###   ######    ");
        System.out.println("\t\t\t   ###  ###   ###    ##         ##        ##      \t\t\t\t  ##        ##     ##  ###            ###  ##        ");
        System.out.println("\t\t\t    ##### ######     ########## ######### ########\t\t\t\t  ######### ######### ###              ### ##########");
        System.out.println("\t\t\t--------------------------------------------------\t\t\t\t-----------------------------------------------------");
        for(long i=0;i<500000000;i++);
        System.out.print("\f");
        System.out.println("\t\t\t\t--------------------------------------------------\t\t\t-----------------------------------------------------");
        System.out.println("\t\t\t\t###              ### ########## ##        ##      \t\t\t  ######### #########     ##### ######     ##########");
        System.out.println("\t\t\t\t ###            ###  ##         ##        ##      \t\t\t  ##        ##     ##    ###  ###   ###    ##        ");
        System.out.println("\t\t\t\t  ###    #     ###   ######     ##        ##      \t\t\t  ##        ##     ##   ###    #     ###   ######    ");
        System.out.println("\t\t\t\t   ###  ###   ###    ##         ##        ##      \t\t\t  ##        ##     ##  ###            ###  ##        ");
        System.out.println("\t\t\t\t    ##### ######     ########## ######### ########\t\t\t  ######### ######### ###              ### ##########");
        System.out.println("\t\t\t\t--------------------------------------------------\t\t\t-----------------------------------------------------");
        for(long i=0;i<500000000;i++);
        System.out.print("\f");
        System.out.println("\t\t\t\t\t--------------------------------------------------\t\t-----------------------------------------------------");
        System.out.println("\t\t\t\t\t###              ### ########## ##        ##      \t\t  ######### #########     ##### ######     ##########");
        System.out.println("\t\t\t\t\t ###            ###  ##         ##        ##      \t\t  ##        ##     ##    ###  ###   ###    ##        ");
        System.out.println("\t\t\t\t\t  ###    #     ###   ######     ##        ##      \t\t  ##        ##     ##   ###    #     ###   ######    ");
        System.out.println("\t\t\t\t\t   ###  ###   ###    ##         ##        ##      \t\t  ##        ##     ##  ###            ###  ##        ");
        System.out.println("\t\t\t\t\t    ##### ######     ########## ######### ########\t\t  ######### ######### ###              ### ##########");
        System.out.println("\t\t\t\t\t--------------------------------------------------\t\t-----------------------------------------------------");
        for(long i=0;i<500000000;i++);
        System.out.print("\f");
        System.out.println("\t\t\t\t\t\t--------------------------------------------------\t-----------------------------------------------------");
        System.out.println("\t\t\t\t\t\t###              ### ########## ##        ##      \t  ######### #########     ##### ######     ##########");
        System.out.println("\t\t\t\t\t\t ###            ###  ##         ##        ##      \t  ##        ##     ##    ###  ###   ###    ##        ");
        System.out.println("\t\t\t\t\t\t  ###    #     ###   ######     ##        ##      \t  ##        ##     ##   ###    #     ###   ######    ");
        System.out.println("\t\t\t\t\t\t   ###  ###   ###    ##         ##        ##      \t  ##        ##     ##  ###            ###  ##        ");
        System.out.println("\t\t\t\t\t\t    ##### ######     ########## ######### ########\t  ######### ######### ###              ### ##########");
        System.out.println("\t\t\t\t\t\t--------------------------------------------------\t-----------------------------------------------------");
        for(long i=0;i<500000000;i++);
        System.out.print("\f");
        System.out.println("\t\t\t\t\t\t\t-------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t###              ### ########## ##        ##        ######### #########     ##### ######     ##########");
        System.out.println("\t\t\t\t\t\t\t ###            ###  ##         ##        ##        ##        ##     ##    ###  ###   ###    ##        ");
        System.out.println("\t\t\t\t\t\t\t  ###    #     ###   ######     ##        ##        ##        ##     ##   ###    #     ###   ######    ");
        System.out.println("\t\t\t\t\t\t\t   ###  ###   ###    ##         ##        ##        ##        ##     ##  ###            ###  ##        ");
        System.out.println("\t\t\t\t\t\t\t    ##### ######     ########## ######### ########  ######### ######### ###              ### ##########");
        System.out.println("\t\t\t\t\t\t\t-------------------------------------------------------------------------------------------------------");
        System.out.println("THIS IS A COMPUTER OPERATED SYSTEM TO MANAGE YOUR BANK ACCOUNT");
        System.out.print("\n\n\n\n\nPRESS ENTER TO CONTINUE");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
    }

    static void create()throws IOException
    {
        System.out.println("\f");
        System.out.println("WELCOME TO THE CREATION STEP :\nENTER YOUR FULL NAME");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String name=br.readLine();
        System.out.println("\f");
        System.out.println("WELCOME TO THE CREATION STEP :\nENTER DATE");
        String date=br.readLine();
        System.out.println("\f");
        System.out.println("WELCOME TO THE CREATION STEP :\nINITIAL DEPOSIT AMOUNT IS 5000 ACCEPTED");
        String amount="5000";
        System.out.println("PRESS ENTER TO CONTINUE");
        String arr=br.readLine();
        System.out.println("\f");
        FileWriter fw = new FileWriter("ac_no.txt",true);
        fw.close();
        FileReader f = new FileReader("ac_no.txt");
        BufferedReader b = new BufferedReader(f);
        String acno=b.readLine();
        b.close();
        int an=0;
        if(acno == null)
            an=1000000;
        else
            an=Integer.parseInt(acno);
        an++;
        System.out.println("NAME OF ACCOUNT HOLDER :"+name+"\nDATE OF CREATION :"+date+"\nINITIAL DEPOSIT AMOUNT :"+amount+"\n ALLOTED ACCOUNT NUMBER :"+an);
        System.out.print("\nENTER Y TO SAVE ELSE QUIT");
        String s=br.readLine();
        if(s.equalsIgnoreCase("Y"))
        {
            fw = new FileWriter("ac_no.txt");
            BufferedWriter bw =new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(""+an);
            pw.close();
            fw = new FileWriter("entry.txt",true);
            bw =new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.println(name+"-"+an+"-"+date+"-"+amount+"-     -"+amount);
            pw.close();
            fw = new FileWriter(an+".txt");
            bw =new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.print(""+amount);
            pw.close();
        }
    }

    static void deposit()throws IOException
    {
        System.out.println("\fWELCOME TO THE DEPOSITION SYSTEM\n");
        System.out.println("ENTER THE ACCOUNT NO OF DEPOSITION:");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String an=br.readLine();
        System.out.println("ENTER THE DATE");
        String date=br.readLine();
        System.out.println("ENTER YOUR NAME");
        String name=br.readLine();
        System.out.println("ENTER THE AMOUNT OF DEPOSITION");
        float am=Float.parseFloat(br.readLine());
        try
        {
            FileReader f = new FileReader(an+".txt");
            BufferedReader b = new BufferedReader(f);
            String s=b.readLine();
            float amount=am+Float.parseFloat(s);
            b.close();
            FileWriter fw = new FileWriter(an+".txt");
            BufferedWriter bw =new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(amount);
            pw.close();
            fw = new FileWriter("entry.txt",true);
            bw =new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.println(name+"-"+an+"-"+date+"-"+am+"-     -"+amount);
            pw.close();
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("\n ACCOUNT NOT FOUND");
        }
        System.out.print("\n\n\nPRESS ENTER TO CONTINUE");
        String s=br.readLine();
    }

    static void withraw()throws IOException
    {
        System.out.println("\fWELCOME TO THE WITHRWAL SYSTEM\n");
        System.out.println("ENTER THE ACCOUNT NO OF WITHRWAL:");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String an=br.readLine();
        System.out.println("ENTER THE DATE");
        String date=br.readLine();
        System.out.println("ENTER YOUR NAME");
        String name=br.readLine();
        System.out.println("ENTER THE AMOUNT OF WITHRWAL");
        float am=Float.parseFloat(br.readLine());
        try
        {
            FileReader f = new FileReader(an+".txt");
            BufferedReader b = new BufferedReader(f);
            String s=b.readLine();
            b.close();
            if(Float.parseFloat(s)>am)
            {
                float amount=Float.parseFloat(s)-am;
                FileWriter fw = new FileWriter(an+".txt");
                BufferedWriter bw =new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                pw.print(amount);
                pw.close();
                fw = new FileWriter("entry.txt",true);
                bw =new BufferedWriter(fw);
                pw = new PrintWriter(bw);
                pw.println(name+"-"+an+"-"+date+"-"+"     -"+am+"-"+amount);
                pw.close();
            }
            else
            {
              System.out.println("\fTRANSCTION CANNOT BE DONE INSUFFICIENT ACCOUNT BALANCE");
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("\n ACCOUNT NOT FOUND");
        }
        System.out.print("\n\n\nPRESS ENTER TO CONTINUE");
        String s=br.readLine();
    }

    static void history()throws IOException
    {
        System.out.println("\fWELLCOME TO THE PASSBOOK UPDATE SYSTEM\nPLEASE ENTER YOUR ACCOUNT NUMBER :");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String an=br.readLine();
        System.out.print("\fNAME                     ACCOUNT NO              DATE                  DEPOSIT                 WITHRWAL                BALANCE\n\n");
        FileReader f = new FileReader("entry.txt");
        BufferedReader b = new BufferedReader(f);
        String s="";
        while(true)
        {
            s=b.readLine();
            if(s==null)
                break;
            String n=s.substring(s.indexOf('-')+1,s.indexOf('-',s.indexOf('-')+1));
            if(n.equals(an))
            {
                int i=s.indexOf('-');
                System.out.print(s.substring(0,i)+"\t\t\t");
                int k=s.indexOf('-',i+1);
                System.out.print(s.substring(i+1,k)+"\t\t\t");
                i=k;
                k=s.indexOf('-',i+1);
                System.out.print(s.substring(i+1,k)+"\t\t\t");
                i=k;
                k=s.indexOf('-',i+1);
                System.out.print(s.substring(i+1,k)+"\t\t\t");
                i=k;
                k=s.indexOf('-',i+1);
                System.out.print(s.substring(i+1,k)+"\t\t\t");
                System.out.print(s.substring(k+1));
            }
            System.out.println();
        }
        System.out.println("\n\nPRESS ENTER TO CONTINUE");
        String n=br.readLine();
    }
}