import express from "express";
import ChargeController from "../controllers/chargeController.js";

const router = express.Router();

router
  .post("/api/charges", ChargeController.post)
  .get("/api/charges/:id", ChargeController.findById) 

export default router;   