package com.backporfolio.service.redesSociales;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backporfolio.model.RedesSociales;
import com.backporfolio.repository.RedesSocialesRepository;

@Service
public class RedesService implements IRedesSocialesService {

	@Autowired
	private RedesSocialesRepository redeRepo;

	@Override
	public List<RedesSociales> getAllRedes() {

		return redeRepo.findAll();
	}

	@Override
	public RedesSociales saveRedes(RedesSociales redes) {

		return redeRepo.save(redes);
	}

	@Override
	public void deleteRedes(Long id) {
		redeRepo.deleteById(id);

	}

	@Override
	public RedesSociales findById(Long id) {

		return redeRepo.findById(id).orElse(null);
	}

}
