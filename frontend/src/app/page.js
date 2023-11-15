import { useState } from "react";
import { useForm, Controller } from "react-hook-form";
import { Box, Typography, TextField, Grid, Button } from "@mui/material";


export default function Home() {
  const {control, handleSubmit, reset, formState: {errors, isValid}} = useForm()
  const [items, setItems] = useState([])
  
  const onSubmit = async (data) => {
    const response = await fetch("/getItemsByName/" + data.replace(/ /g, "%20"))
  }

  

  return (
   <Box sx={{m:2}}>
      <Typography variant="h6" fontWeight="bold" sx={{m: 2}}>
        Enter A Food
      </Typography>
      <form id="foodForm" onSubmit={handleSubmit(onSubmit)}>

      </form>
   </Box>
  )
}
