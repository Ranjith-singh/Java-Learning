package tags;

import java.util.Date;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class tag_handler extends TagSupport
{

	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try
		{
			JspWriter out=pageContext.getOut();
			out.println("<h1>this is my own tag handler</h1>"
					+ "<p>today's date is "+new Date().toString()+"</p>"
					+ "<hr>"
					+ "hari om!..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}
