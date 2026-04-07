/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.home.octtodec;
import java.util.regex.*;
/**
 *
 * @author PC
 */
public class OctToDec 
{

    public static void main(String[] args) throws Exception
    {
        final long MAX_INT = 2L * Integer.MAX_VALUE + 1L;
        var nDecNum = 0;
        var nOctPower = 1;
        var console = System.console();
        var nMaxOctalLen = Math.floor(Math.log(MAX_INT) / Math.log(8));
        var oRegExpr = Pattern.compile("^[0-7]+$");
        System.out.println("Input an octal number");
        var strLine = console.readLine();
        var nStrLen = strLine.length();
        var oMatcher = oRegExpr.matcher(strLine);
        var bIsMatch = oMatcher.matches();
        var bRightString = (nStrLen <= nMaxOctalLen) && (bIsMatch);
        if(!bRightString)
        {
            System.out.println("Wrong binary number format!!!");
            System.exit(0);
        }
        for (int i = 0; i < nStrLen; i++)
        {
            int nOctDight = strLine.charAt(nStrLen - 1 - i) - '0';
            nDecNum += (nOctDight * nOctPower);
            nOctPower *= 8;
        }
        System.out.printf
        (
            "The decenary equivalent of the binary number %s is %d\r\n",
            strLine, nDecNum
        );
    }
}
