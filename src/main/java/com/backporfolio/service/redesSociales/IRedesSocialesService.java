package com.backporfolio.service.redesSociales;

import java.util.List;

import com.backporfolio.model.RedesSociales;

public interface IRedesSocialesService {
	public List<RedesSociales> getAllRedes();

	public RedesSociales saveRedes(RedesSociales redes);

	public void deleteRedes(Long id);

	public RedesSociales findById(Long id);
}
