package at.mirtschi.Wiesenbluetenhof.controller;

import at.mirtschi.Wiesenbluetenhof.datamodel.*;
import at.mirtschi.Wiesenbluetenhof.dto.PositionDTO;
import at.mirtschi.Wiesenbluetenhof.repository.PositionRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/positions")
public class PositionController {

    @Autowired
    private PositionRepository positionRepo;

    public PositionController(PositionRepository positionRepo) {
        this.positionRepo = positionRepo;
    }

    @PostMapping("/create")
    public Position createPosition(@RequestBody @Valid PositionDTO positionDTO) {
        Position position = fromDTO(positionDTO);
        positionRepo.save(position);
        return position;
    }

    private static Position fromDTO(PositionDTO positionDTO) {
        return new Position(positionDTO.getId(),
                positionDTO.getQuantity());
    }


}
