package Utils;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import com.core.pens.Pen;

public interface IOutils {

	static void storePenDetails(List<Pen> plist, String fname) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(fname))) {

			for (Pen p : plist) {
				pw.println(p.toString1());
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
