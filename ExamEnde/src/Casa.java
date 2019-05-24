
public class Casa {
	private float superficie;
	private String calle;
	private int codigoPostal;
	
	/**
	 * Un equipo de ladrones deja la casa limpia
	 * y roba hasta el cobre de las paredes
	 */
	public void limpiarLaCasa()
	{
		verMensaje();
	}

	private void verMensaje() {
		String mensajito="Te hemos limpiado la casa, esta desinfectada";
		System.out.println(mensajito);
	}

	
}
