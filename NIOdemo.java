import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class NIOdemo
{
	public static void main(String[] args)
	{
		Path source=Paths.get("D:Hello.java");
		Path target=Paths.get("D:NIOdemo/Hello.java");
		try
		{
			Files.copy(source, target, REPLACE_EXISTING, COPY_ATTRIBUTES);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}