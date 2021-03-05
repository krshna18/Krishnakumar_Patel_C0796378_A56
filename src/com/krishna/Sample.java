package com.krishna;

import javax.swing.*;

public class Sample {
    //User Details
    String first_Name;
    String last_Name;
    int hours;
    int days;
    int boxes;
    String packagee;
    String option_Size;
    String box_Size;

    //Costs to be calculated
    int service_Cost;
    double option_Cost;
    double items_Cost;
    double total_Cost;

    public Sample(String first_Name, String last_Name, int hours, int days, int boxes, String packages, String option_Size, String box_Size) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.hours = hours;
        this.days = days;
        this.boxes = boxes;
        this.packagee = packages;
        this.option_Size = option_Size;
        this.box_Size = box_Size;
    }

    public void show_Service_Cost()
    {
        if(packagee.equalsIgnoreCase("A"))
        {
            this.service_Cost=this.hours*100;
        }
        else
        if(packagee.equalsIgnoreCase("B"))
        {
            this.service_Cost=this.hours*150;
        }
        JOptionPane.showMessageDialog(null, this.first_Name+", your service cost is $"+this.service_Cost);
    }
    public void show_Option_Cost()
    {
        if(option_Size.equalsIgnoreCase("small"))
        {
            this.option_Cost=this.days*8;
        }
        else
        if(option_Size.equalsIgnoreCase("large"))
        {
            this.option_Cost=this.days*20.11;
        }
        JOptionPane.showMessageDialog(null, this.first_Name+", your option cost is $"+this.option_Cost);

    }

    public void show_Item_Cost()
    {
        if(box_Size.equalsIgnoreCase("small"))
        {
            this.items_Cost=this.boxes*2.50;
        }
        else
        if(box_Size.equalsIgnoreCase("large"))
        {
            this.items_Cost=this.boxes*4.50;
        }
        JOptionPane.showMessageDialog(null, this.first_Name+", your item cost is $"+this.items_Cost);
    }

    public void show_Total_Cost()
    {
        this.total_Cost=this.service_Cost+this.option_Cost+this.items_Cost;
        JOptionPane.showMessageDialog(null, this.first_Name+", your total cost is $"+this.total_Cost);
    }
}
