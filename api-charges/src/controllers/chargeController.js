
class ChargeController {

  static findById = (req, res) => {
    var obj = {
      "charge": {
        "id": req.params.id,
        "name": "Gabriel Rocha",
        "revisionDate": 1449128440000,
        "value":58.9,
        "type":"DEBITO"
      }
    };
      res.status(200).json(obj);
  }

  static post = (req, res) => {
    var obj = {
      "charge": {
        "id": 585897,
        "name": "Gabriel Rocha",
        "revisionDate": 1449128440000,
        "value":143.9,
        "type":"PIX"
      }
    };

      res.status(201).json(obj);
  }
}


 

export default ChargeController