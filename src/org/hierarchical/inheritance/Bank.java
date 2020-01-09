package org.hierarchical.inheritance;

public class Bank {
public static void main(String[] args)
{
Icici i = new Icici();
i.aadharDetails();
i.panDetails();
i.accNo();
i.atmPin();

Idbi id = new Idbi();
id.aadharDetails();
id.panDetails();
id.accNo();
id.atmPin();

Sbi s = new Sbi();
s.aadharDetails();
s.panDetails();
s.accNo();
s.atmPin();

}
}
