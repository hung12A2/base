package subsystem.interbank;

import common.exception.UnrecognizedException;
import utils.API;

// no data coupling
// no stamp coupling
public class InterbankBoundary {

	String query(String url, String data) {
		String response = null;
		try {
			response = API.post(url, data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new UnrecognizedException();
		}
		return response;
	}

}
