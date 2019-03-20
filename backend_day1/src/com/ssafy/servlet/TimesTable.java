package com.ssafy.servlet;

public class TimesTable {
	public String getTimesTable(int dan) {
		StringBuilder sb = new StringBuilder("<html><body>");
		sb.append("<table border='1'><th>first num</th><th>second num</th><th>result</th>");
		for(int i =1; i<=9; i++) {
			sb.append("<tr>");
			sb.append("<td>"+ dan +"</td>");
			sb.append("<td>"+i+"</td>");
			sb.append("<td>"+dan*i+"</td>");
			sb.append("</tr>");
		}
		sb.append("</table>");
        sb.append("</body></html>");
        return sb.toString();
	}
}
