package com.accolite.thinkingmovie;

import java.util.List;

import com.omertron.omdbapi.OMDBException;
import com.omertron.omdbapi.OmdbApi;
import com.omertron.omdbapi.model.OmdbVideoBasic;
import com.omertron.omdbapi.model.SearchResults;
import com.omertron.omdbapi.tools.OmdbBuilder;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Test {
	public static void main(String[] args) {
		String split = "[2018-06-08 15:27:35,147]  DEBUG (transformer:?): Message Vinod count: <OBX><OBX.1><OBX.1.1>1</OBX.1.1></OBX.1><OBX.2><OBX.2.1>TX</OBX.2.1></OBX.2><OBX.3/><OBX.4/><OBX.5><OBX.5.1>PROCEDURE: MRI OF THE LEFT KNEE WITHOUT CONTRAST</OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>HISTORY: Left knee pain for three months. Patient experienced a “pop” in her knee when playing tennis.</OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>TECHNIQUE: MRI of the left knee was performed on the 1.5 Tesla magnet operating at ECIC. Images were obtained in multiple planes and with varying pulse sequences. No contrast was utilized.</OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>FINDINGS: Comparison is made with radiographs of 6/22/07. These demonstrate a small joint effusion but otherwise unremarkable. </OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>There is a very small joint effusion noted. There is also a small popliteal cyst on the posteromedial aspect of the knee.</OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>The anterior cruciate ligament is nearly completely torn with only a very thin strand of the anterior ventral fibers remaining intact. This involves the proximal third of the ligament. The posterior cruciate ligament is intact. The collateral ligaments are intact although the medial collateral ligament demonstrates mild thickening. </OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>In the lateral compartment there is a mild impaction fracture near the sulcus terminalis of the lateral femoral condyle. There is a mild resolving contusion present on the posterior lip of the lateral tibial plateau. Along the periphery of the posterior horn of the lateral meniscus there is a subtle area of linear increased signal concerning for potential vertical meniscal tear. This would be in the excepted location of the red zone. </OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>In the medial compartment, the meniscus is intact. No articular cartilage defects are seen. </OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>In the patellofemoral joint the articular cartilage is intact. </OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>IMPRESSION:</OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>1. Findings are consistent with a high grade, probably unstable, near complete tear of the anterior cruciate ligament. </OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>2. Small peripheral vertical tear through the excepted location of the red zone of the posterior horn of the lateral meniscus.</OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>3. Contusions in the lateral femoral condyle with a mild impaction fracture at the sulcus terminalis as well as in the lateral tibial plateau consistent with a pivot shift mechanism of injury. </OBX.5.1></OBX.5><OBX.5><OBX.5.1> </OBX.5.1></OBX.5><OBX.5><OBX.5.1>4. Small joint effusion and small popliteal cyst. </OBX.5.1></OBX.5><OBX.6/><OBX.7/><OBX.8/><OBX.9/><OBX.10/><OBX.11><OBX.11.1>F</OBX.11.1></OBX.11></OBX>\n"
				+ "";
	String [] arr=	split.split("~ ~");
	System.out.println(arr.length);
//	System.out.println(split.split("~ ~").length);
	}
}
