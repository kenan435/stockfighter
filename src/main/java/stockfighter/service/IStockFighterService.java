package stockfighter.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import stockfighter.pojo.Level;
import stockfighter.pojo.LevelControl;
import stockfighter.pojo.Order;
import stockfighter.pojo.OrderResponse;
import stockfighter.pojo.Orderbook;

public interface IStockFighterService {

	final static String API_KEY = "2e5b8ebee62687ec9d8b5c5f619a9fd54053a999";
	final static String SCHEMA = "https";
	final static String HOST = "api.stockfighter.io";
	final static String PATH = "/ob/api";

	// Interfacing with the gamemaster properties
	final static String URL = "https://www.stockfighter.io/gm";

	/**
	 * @param venue
	 * @return
	 * @throws URISyntaxException
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public boolean isVenueUp(String venue)
			throws URISyntaxException, JsonGenerationException, JsonMappingException, IOException;

	/**
	 * @param venue
	 * @param stock
	 * @return
	 * @throws URISyntaxException
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public Orderbook getOrderBookForStock(String venue, String stock)
			throws URISyntaxException, JsonGenerationException, JsonMappingException, IOException;

	public OrderResponse placeOrderForStock(Order order) throws UnsupportedEncodingException, URISyntaxException,
			JsonGenerationException, JsonMappingException, IOException;

	public Level startLevel(String levelName, LevelControl levelControl, String instaceID)
			throws URISyntaxException, JsonGenerationException, JsonMappingException, IOException;
}
