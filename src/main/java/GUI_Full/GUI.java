package GUI_Full;

import gui_codebehind.GUI_BoardController;
import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Board;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;

import java.awt.*;

// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public final class GUI
{
    public final Color BASECOLOR;
    private GUI_BoardController bc;
    private static boolean null_fields_allowed = false;


    public GUI(GUI_Field[] fields)
    {
        this.BASECOLOR = GUI_Board.BASECOLOR;
        if (!null_fields_allowed)
        {
            this.check_for_null_fields(fields);
        }

        if (fields.length < 16)
        {
            GUI_Field[] tempFields = new GUI_Field[16];

            for(int i = 0; i < fields.length; ++i)
            {
                tempFields[i] = fields[i];
            }

            fields = tempFields;
        }

        this.bc = new GUI_BoardController(fields);
    }

    public GUI()
    {
        this.BASECOLOR = GUI_Board.BASECOLOR;
        GUI_Field[] fields = GUI_FieldFactory.makeFields();

        for(int i = 0; i < fields.length; ++i)
        {
            fields[i] = fields[i];
        }

        this.bc = new GUI_BoardController(fields);
    }

    private void check_for_null_fields(GUI_Field[] fields)
    {
        String msg = "Null fields!\nNull fields are not recommended! the following indecies are null: ";
        String str = "{";
        String howTo = "Disable this Exception by calling the static method GUI.setNull_fields_allowed(true);";

        for(int i = 0; i < fields.length; ++i)
        {
            GUI_Field f = fields[i];
            if (f == null)
            {
                str = str + i + ", ";
            }
        }

        str = str + "}";
        str = str.replace(", }", "}");
        if (str.length() > 2)
        {
            throw new NullPointerException(msg + str + "\n" + howTo);
        }
    }

    public void showMessage(String msg)
    {
        msg = msg.replace("\n", "<BR>");
        this.bc.showMessage(msg);
    }

    public String getUserString(String msg)
    {
        msg = msg.replace("\n", "<BR>");
        return this.bc.getUserString(msg);
    }

    public int getUserInteger(String msg, int min, int max)
    {
        msg = msg.replace("\n", "<BR>");
        return this.bc.getUserInteger(msg, min, max);
    }

    public int getUserInteger(String msg)
    {
        msg = msg.replace("\n", "<BR>");
        return this.bc.getUserInteger(msg, 0, 999999999);
    }

    public String getUserButtonPressed(String msg, String... buttons)
    {
        msg = msg.replace("\n", "<BR>");

        for(int i = 0; i < buttons.length; ++i) {
            buttons[i] = buttons[i].replace("\n", "<BR>");
        }

        return this.bc.getUserButtonPressed(msg, buttons).toString();
    }

    public String getUserSelection(String msg, String... options)
    {
        msg = msg.replace("\n", "<BR>");

        for(int i = 0; i < options.length; ++i) {
            options[i] = options[i].replace("\n", "<BR>");
        }

        return this.bc.getUserSelection(msg, options).toString();
    }

    public boolean getUserLeftButtonPressed(String msg, String trueButton, String falseButton)
    {
        msg = msg.replace("\n", "<BR>");
        trueButton = trueButton.replace("\n", "<BR>");
        falseButton = falseButton.replace("\n", "<BR>");
        return this.bc.getUserButtonPressed(msg, new String[]{trueButton, falseButton}).equals(trueButton);
    }

    public boolean addPlayer(GUI_Player player)
    {
        return this.bc.addPlayer(player);
    }

    public void setDice(int faceValue1, int rotation1, int faceValue2, int rotation2)
    {
        this.bc.setDice(faceValue1, rotation1, faceValue2, rotation2);
    }

    public void setDice(int faceValue1, int faceValue2)
    {
        this.bc.setDice(faceValue1, faceValue2);
    }

    public void setDie(int faceValue)
    {
        this.bc.setDie(faceValue);
    }

    public void displayChanceCard(String txt)
    {
        txt = txt.replace("\n", "<BR>");
        this.bc.displayChanceCard(txt);
    }

    public void setChanceCard(String txt)
    {
        txt = txt.replace("\n", "<BR>");
        this.bc.setChanceCard(txt);
    }

    public void displayChanceCard()
    {
        this.bc.displayChanceCard();
    }

    public GUI_Field[] getFields()
    {
        return this.bc.getFields();
    }

    public static boolean isNull_fields_allowed()
    {
        return null_fields_allowed;
    }

    public static void setNull_fields_allowed(boolean allowed)
    {
        null_fields_allowed = allowed;
    }
}


