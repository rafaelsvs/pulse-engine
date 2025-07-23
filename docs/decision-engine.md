# Motor de Decisão

## Fórmula de incentivo

```
incentive = baseValue
  + (demandScore * demandWeight)
  + (supplyScore * supplyWeight)
  + (acceptanceRate * acceptanceWeight)
  + (weatherPenalty * weatherBonus)
  + (isPeakHour ? peakHourBonus : 0)
```

Valores simulados no backend.
