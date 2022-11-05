
class ChargeController {

  static findById = (req, res) => {
      res.status(200);
  }

  static post = (req, res) => {
      res.status(201).json(Math.random().toString(36));
  }
}


 

export default ChargeController