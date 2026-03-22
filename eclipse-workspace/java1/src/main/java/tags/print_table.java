package tags;

import java.text.NumberFormat.Style;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class print_table extends TagSupport
{

	int num;
	String colour;
	
	public void setColor(String colour) {
		this.colour = colour;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try
		{
			JspWriter out=pageContext.getOut();
			out.println("<div style='color:"+colour+"'>");
			out.println("<br>");
			for(int i=1;i<=10;i++)
			{
				out.println((num*i)+"<br>");
			}
			out.println("</div>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
}
